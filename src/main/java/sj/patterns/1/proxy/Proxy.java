package sj.patterns.proxy;

interface Subject {

    public void Operation(String query);
}

class RealSubject implements Subject {

    @Override
    public void Operation(String qurey) {
        System.out.println(qurey);
    }
}

class Proxy implements Subject {

    private String password;
    private RealSubject realSubject = new RealSubject();

    public Proxy(String password) {
        this.password = password;
    }

    @Override
    public void Operation(String query) {
        if (Authentication()) {
            realSubject.Operation(query);
        } else {
            System.out.println("Access Denied!");
        }
    }

    private boolean Authentication() {
        return this.password.equals("12345");
    }
}

class Run {

    public static void main(String[] args) {
        Proxy proxy = new Proxy("12345");
        proxy.Operation("Connected!");
    }
}