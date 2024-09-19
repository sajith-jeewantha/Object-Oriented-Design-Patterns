/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author sajithjeewantha
 */
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

public class S {

    public static void main(String[] args) {
        Context c = new Context();

        Strategy subStrategy1 = new SubStrategy1();
        Strategy subStrategy2 = new SubStrategy2();

        c.setStrategy(subStrategy2);
        c.useStrategy("zoo");
    }
}
