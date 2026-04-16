package sj.patterns.builder;


class User {
    private final String name;
    private final String password;
    private final String email;


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private String password;
        private String email;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        User build() {
            return new User(this);
        }
    }

    public void display() {
        System.out.println(this.name + " " + this.password + " " + this.email);
    }
}

public class Builder {

    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("John")
                .setEmail("john@gmail.com")
                .setPassword("123")
                .build();

        user.display();
    }
}
