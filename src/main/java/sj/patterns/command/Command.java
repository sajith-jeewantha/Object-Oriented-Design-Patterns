package sj.patterns.command;

interface Cmd {
    public abstract void execute();
}

class ConcreteCommandA implements Cmd {

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.ActionA();
    }
}

class ConcreteCommandB implements Cmd {

    public Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.ActionB();
    }
}

class Receiver {

    public void ActionA() {
        System.out.println("ActionA");
    }

    public void ActionB() {
        System.out.println("ActionB");
    }
}

class Invoke {
    private Cmd cmd;

    public Invoke(Cmd cmd) {
        this.cmd = cmd;
    }

    public void Action() {
        this.cmd.execute();
    }
}


public class Command {

    public static void main(String[] args) {

        Invoke invoke = new Invoke(new ConcreteCommandB(new Receiver()));
        invoke.Action();

    }
}