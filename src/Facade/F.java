/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author sajithjeewantha
 */
class Sub1 {

    public void operation() {
        System.out.println("Sub1 Op");
    }
}

class Sub2 {

    public void operation() {
        System.out.println("Sub2 Op");
    }
}

class Sub3 {

    public void operation() {
        System.out.println("Sub3 Op");
    }
}

class Main {

    private Sub1 sub1 = new Sub1();
    private Sub2 sub2 = new Sub2();
    private Sub3 sub3 = new Sub3();

    public void Operation() {
        sub1.operation();
        sub2.operation();
        sub3.operation();
    }
}

public class F {

    public static void main(String[] args) {
        Main m = new Main();
        m.Operation();
    }
}
