package sj.patterns.state;

interface State {

    public abstract void handle();
}

class ConcreteState1 implements State {

    @Override
    public void handle() {
        System.out.println("ConcreteState 1");
    }
}

class ConcreteState2 implements State {

    @Override
    public void handle() {
        System.out.println("ConcreteState 2");
    }
}

class Context {

    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        this.currentState.handle();
    }
}

class Run {

    public static void main(String[] args) {

        Context context = new Context();

        ConcreteState1 cs1 = new ConcreteState1();
        context.setState(cs1);
        context.request();

        ConcreteState2 cs2 = new ConcreteState2();
        context.setState(cs2);
        context.request();

    }
}