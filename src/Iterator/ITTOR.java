/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author sajithjeewantha
 */
interface Iterator {

    public abstract boolean hashNext();

    public abstract Object Next();
}

class arrayIterator implements Iterator {

    private Object Array[];
    private int index;

    public arrayIterator(Object[] Array) {
        this.Array = Array;
    }

    @Override
    public boolean hashNext() {
        return index < Array.length;
    }

    @Override
    public Object Next() {
        return Array[index++];
    }
}

class ArrayListIterator implements Iterator {

    private ArrayList arraylist;
    private int index;

    public ArrayListIterator(ArrayList arraylist) {
        this.arraylist = arraylist;
    }

    @Override
    public boolean hashNext() {
        return index < arraylist.size();
    }

    @Override
    public Object Next() {
        return arraylist.get(index++);
    }
}

public class ITTOR {

    public static void main(String[] args) {

        String a[] = {"java", "Python", "C++"};

        arrayIterator aIterator = new arrayIterator(a);
        while (aIterator.hashNext()) {
            System.out.println(aIterator.Next());
        }

        ArrayList al = new ArrayList();
        al.add("Cake");
        al.add("Pizza");
        al.add("Lasagna");
        al.add("Tea Bun");

        ArrayListIterator arrayListIterator = new ArrayListIterator(al);
        while (arrayListIterator.hashNext()) {
            System.out.println(arrayListIterator.Next());
        }
    }
}
