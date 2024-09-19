/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author sajithjeewantha
 */
interface Command {

    public abstract void execute();
}

class ConcreteCommand1 implements Command {

    private Receiver Receiver;

    public ConcreteCommand1(Receiver Receiver) {
        this.Receiver = Receiver;
    }

    @Override
    public void execute() {
        this.Receiver.ActionA();
    }
}

class ConcreteCommand2 implements Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.ActionB();
    }
}

class Receiver {

    public void ActionA() {
        System.out.println("Action A");
    }

    public void ActionB() {
        System.out.println("Action B");
    }
}

class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void Action() {
        this.command.execute();
    }
}

public class CMD {

    public static void main(String[] args) {

        Invoke invoke = new Invoke(new ConcreteCommand2(new Receiver()));
        invoke.Action();
    }
}
