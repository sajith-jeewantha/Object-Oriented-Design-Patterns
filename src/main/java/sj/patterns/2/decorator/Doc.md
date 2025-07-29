# Decorator Design Pattern in Java

> 📖 Source: [GeeksforGeeks - Decorator Pattern](https://www.geeksforgeeks.org/system-design/decorator-pattern/)

![Decorator Pattern](https://media.geeksforgeeks.org/wp-content/uploads/20240404190205/Decorator-Design-Pattern-.webp)

## 🧠 What is the Decorator Pattern?

The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without modifying the class itself.

It follows the **Open/Closed Principle** — classes are open for extension but closed for modification.

---

## 🧩 Key Concepts

- **Component**: The interface or abstract class defining the operations.
- **ConcreteComponent**: The base implementation.
- **Decorator**: Abstract class that implements the component and holds a reference to a component.
- **ConcreteDecorators**: Add additional behavior before/after delegating to the base component.

---

## 📊 UML Diagram

![Decorator Pattern UML](https://media.geeksforgeeks.org/wp-content/uploads/20240405114106/Decoratorpatternclassdiagram.jpg)