# Composite Design Pattern in Java

> Source: [GeeksforGeeks - Composite Design Pattern in Java](https://www.geeksforgeeks.org/java/composite-design-pattern-in-java/)

## What is the Composite Design Pattern?

The **Composite Pattern** is a structural design pattern that allows you to compose objects into tree structures to represent **part-whole hierarchies**. It lets clients treat individual objects and compositions of objects uniformly.

### Key Concepts

- Treats individual objects and compositions of objects uniformly.
- Implements a tree-like structure.
- Useful when building a structure like a **file system**, **UI components**, or **organization hierarchy**.

## Participants

1. **Component** – An interface that defines common operations.
2. **Leaf** – A basic element in the structure that doesn't have sub-elements.
3. **Composite** – An element that can contain other components (leaf or composite).

# UML Diagram

![Composite UML Diagram](https://media.geeksforgeeks.org/wp-content/uploads/20240213191157/composite-class-dig.png)
