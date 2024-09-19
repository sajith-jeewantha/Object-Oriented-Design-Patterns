/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author sajithjeewantha
 */
public class A {

    int x = 10;
    private static A a;

    private A() {

    }

    public static A getA() {
        if (A.a == null) {
            A.a = new A();
        }
        return A.a;
    }
}

class Test{
    public static void main(String[] args) {
        A a = A.getA();
        System.out.println(a.x);
    }
}