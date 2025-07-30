# Bridge Design Pattern in Java

> Source: [GeeksforGeeks - Bridge Design Pattern](https://www.geeksforgeeks.org/system-design/bridge-design-pattern/)

## What is the Bridge Design Pattern?

The **Bridge Pattern** is a structural design pattern that decouples an abstraction from its implementation so that the
two can vary independently. It’s especially useful when both the abstraction and the implementation may evolve
separately without affecting each other.

### Key Concepts

- **Abstraction and implementation are separated** into different hierarchies.
- Improves **flexibility and scalability** of code.
- Useful in applications where you need to combine multiple dimensions of variation, such as **shapes and rendering APIs
  **, or **devices and operating systems**.

## Participants

1. **Abstraction** – Defines the interface and holds a reference to the implementer.
2. **Refined Abstraction** – Extends the interface defined by Abstraction.
3. **Implementor** – Interface for implementation classes.
4. **Concrete Implementor** – Implements the Implementor interface.

# UML Diagram

![Bridge Class Diagram](https://media.geeksforgeeks.org/wp-content/uploads/Bridge_Design.png)
