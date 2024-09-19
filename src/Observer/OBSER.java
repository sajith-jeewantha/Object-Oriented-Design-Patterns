/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author sajithjeewantha
 */
interface Subject {
    
    public abstract void RegisterObserver(Observer observer);
    
    public abstract void RemoveObserve(Observer observer);
    
    public abstract void NotifyObserver();
}

class ConcreteSubject implements Subject {
    
    private int x;
    private ArrayList<Observer> observersList;
    
    public ConcreteSubject() {
        this.observersList = new ArrayList<>();
    }
    
    @Override
    public void RegisterObserver(Observer observer) {
        this.observersList.add(observer);
    }
    
    @Override
    public void RemoveObserve(Observer observer) {
    }
    
    @Override
    public void NotifyObserver() {
        for (Observer observer : observersList) {
            observer.update(this.x);
        }
    }
    
    public void setX(int x) {
        this.x = x;
        NotifyObserver();
    }
}

interface Observer {
    
    public abstract void update(int x);
}

class ConcreteObserver1 implements Observer {
    
    @Override
    public void update(int x) {
        System.out.println("Update ConcreteObserver 1 : " + x);
    }
}

class ConcreteObserver2 implements Observer {
    
    @Override
    public void update(int x) {
        System.out.println("Update ConcreteObserver 2 : " + x);
    }
}

public class OBSER {
    
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        
        ConcreteObserver1 co1 = new ConcreteObserver1();
        ConcreteObserver2 co2 = new ConcreteObserver2();
        
        subject.RegisterObserver(co1);
        subject.RegisterObserver(co2);
        subject.setX(50);
    }
    
}
