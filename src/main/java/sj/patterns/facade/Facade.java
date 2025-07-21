package sj.patterns.facade;


class ActionA {
    public void Action() {
        System.out.println("ActionA");
    }
}

class ActionB extends ActionA {
    public void Action() {
        System.out.println("ActionB");
    }
}

class ActionC extends ActionA {
    public void Action() {
        System.out.println("ActionC");
    }
}

class Executor {
    private ActionA actionA = new ActionA();
    private ActionB actionB = new ActionB();
    private ActionC actionC = new ActionC();

    public void execute() {
        actionA.Action();
        actionB.Action();
        actionC.Action();
    }
}

public class Facade {

    public static void main(String[] args) {

        Executor executor = new Executor();
        executor.execute();
    }
}