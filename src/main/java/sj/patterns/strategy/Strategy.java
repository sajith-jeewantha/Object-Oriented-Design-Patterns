package sj.patterns.strategy;

interface Strategy {

    public boolean execute(String text);
}

class SubStrategy1 implements Strategy {

    @Override
    public boolean execute(String text) {
        System.out.println("subStrategy1");
        return text.contains("j");
    }
}

class SubStrategy2 implements Strategy {

    @Override
    public boolean execute(String text) {
        System.out.println("subStrategy2");
        return text.contains("Z");
    }
}

class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(String text) {
        System.out.println(this.strategy.execute(text));
    }
}

class Run {

    public static void main(String[] args) {
        Context c = new Context();

        Strategy subStrategy1 = new SubStrategy1();
        Strategy subStrategy2 = new SubStrategy2();

        c.setStrategy(subStrategy2);
        c.useStrategy("zoo");
    }
}