/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author sajithjeewantha
 */
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

public class PX {

    public static void main(String[] args) {
        Proxy proxy = new Proxy("12345");
        proxy.Operation("Connected!");
    }
}
