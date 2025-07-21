package sj.patterns.singleton;

class A {

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

public class Singleton {

    public static void main(String[] args) {
        A a = A.getA();
        System.out.println(a.x);
    }
}
