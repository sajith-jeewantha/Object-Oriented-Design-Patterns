/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

/**
 *
 * @author sajithjeewantha
 */
abstract class FruitJuice {

    public final void Process() {
        SelectFruit();
        if (CanAddIngredients()) {
            AddIngredients();
        }
        Blend();
        Serve();
    }

    public abstract void SelectFruit();

    public abstract void AddIngredients();

    public void Blend() {
        System.out.println("Blend");
    }

    public void Serve() {
        System.out.println("Serve");
    }

    public boolean CanAddIngredients() {
        return true;
    }
}

class AppleJuice extends FruitJuice {

    @Override
    public void SelectFruit() {
        System.out.println("Select Apple");
    }

    @Override
    public void AddIngredients() {
        System.out.println("Water And Sugar");
    }
}

class WaterMelonJuice extends FruitJuice {

    @Override
    public void SelectFruit() {
        System.out.println("Water Melon");
    }

    @Override
    public void AddIngredients() {

    }

    @Override
    public boolean CanAddIngredients() {
        return false;
    }
}

public class TMPL {

    public static void main(String[] args) {

        FruitJuice juice = new AppleJuice();
        juice.Process();
    }
}
