package sj.patterns.decorator;

interface Beverage {
    double cost();

    String description();
}

class Coffee implements Beverage {
    @Override
    public double cost() {
        return 150;
    }

    @Override
    public String description() {
        return "Coffee ";
    }
}

class Tea implements Beverage {
    @Override
    public double cost() {
        return 75;
    }

    @Override
    public String description() {
        return "Tea ";
    }
}

abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 250;
    }

    @Override
    public String description() {
        return "Milk " + this.beverage.description();
    }
}

class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 150;
    }

    @Override
    public String description() {
        return this.beverage.description() + "with Sugar";
    }
}


public class Decorator {

    public static void main(String[] args) {
        Beverage beverage1 = new Coffee();
        beverage1 = new Milk(beverage1);
        beverage1 = new Sugar(beverage1);

        System.out.println(beverage1.cost());
        System.out.println(beverage1.description());

        Beverage beverage2 = new Tea();
        beverage2 = new Sugar(beverage2);

        System.out.println(beverage2.cost());
        System.out.println(beverage2.description());
    }
}
