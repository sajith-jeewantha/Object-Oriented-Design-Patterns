<div align="center">

# 🧩 Object-Oriented Design Patterns

**A comprehensive guide to proven, reusable solutions for common software design challenges.**

[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen.svg)](CONTRIBUTING.md)
[![Stars](https://img.shields.io/github/stars/sajith-jeewantha?style=social)](https://github.com/sajith-jeewantha)

[🌐 Website](https://www.sajithjeewantha.com) • [💼 LinkedIn](https://www.linkedin.com/in/sajith-jeewantha)

</div>

---

## 📖 Overview

Software development often feels like solving a complex puzzle. While **Object-Oriented Programming (OOP)** provides a powerful foundation for building scalable systems, developers regularly face recurring design challenges that can slow progress and introduce technical debt.

**Design patterns** are time-tested, reusable blueprints that address these challenges elegantly. They are not rigid algorithms — they are flexible, language-agnostic strategies that help you build code that is:

- 🔍 **Readable** — Communicate intent clearly to your team
- 🔧 **Maintainable** — Easier to update and debug over time
- 📦 **Modular** — Loosely coupled, highly cohesive components
- 🚀 **Extensible** — Adapt to new requirements with minimal friction

---

## 📚 Pattern Categories

Design patterns are organized into three foundational categories, as defined by the **Gang of Four (GoF)**:

| Category | Focus | Count |
|---|---|---|
| 🔁 Creational | Object creation mechanisms | 4 patterns |
| 🔄 Structural | Object composition & relationships | 7 patterns |
| 🔁 Behavioral | Object communication & responsibility | 11 patterns |

---

## 🔁 Creational Patterns

> *Concerned with the way objects are created, aiming to increase flexibility and reuse of existing code.*

| Pattern | Intent |
|---|---|
| 🔹 **Singleton** | Ensure a class has only one instance and provide a global point of access to it. |
| 🔹 **Factory Method** | Define an interface for creating an object, but let subclasses decide which class to instantiate. |
| 🔹 **Builder** | Separate the construction of a complex object from its representation, enabling the same process to produce different results. |
| 🔹 **Prototype** | Create new objects by cloning an existing instance — ideal when object creation is costly. |

---

## 🔄 Structural Patterns

> *Concerned with how classes and objects are composed to form larger, more flexible structures.*

| Pattern | Intent |
|---|---|
| 🔸 **Adapter** | Convert the interface of a class into another interface that clients expect — bridging incompatibilities. |
| 🔸 **Facade** | Provide a unified, simplified interface to a complex subsystem. |
| 🔸 **Proxy** | Provide a surrogate or placeholder to control access to another object. |
| 🔸 **Decorator** | Attach additional responsibilities to an object dynamically, without altering its core structure. |
| 🔸 **Composite** | Compose objects into tree structures to represent part-whole hierarchies uniformly. |
| 🔸 **Bridge** | Decouple an abstraction from its implementation, allowing each to evolve independently. |
| 🔸 **Flyweight** | Minimize memory usage by sharing as much data as possible with similar objects. |

---

## 🔁 Behavioral Patterns

> *Concerned with communication, responsibility, and algorithms between objects.*

| Pattern | Intent |
|---|---|
| 🔹 **Strategy** | Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime. |
| 🔹 **Template Method** | Define the skeleton of an algorithm in a base class, deferring some steps to subclasses. |
| 🔹 **Iterator** | Provide a way to access elements of a collection sequentially without exposing its underlying structure. |
| 🔹 **Observer** | Establish a one-to-many dependency so that when one object changes state, all dependents are notified automatically. |
| 🔹 **State** | Allow an object to alter its behavior when its internal state changes — the object will appear to change its class. |
| 🔹 **Command** | Encapsulate a request as an object, enabling parameterization, queuing, logging, and undoable operations. |
| 🔹 **Chain of Responsibility** | Pass requests along a chain of handlers, where each decides to process or forward the request. |
| 🔹 **Interpreter** | Given a language, define a representation for its grammar and an interpreter to handle sentences. |
| 🔹 **Mediator** | Define an object that encapsulates how a set of objects interact, promoting loose coupling. |
| 🔹 **Memento** | Capture and externalize an object's internal state so it can be restored later, without violating encapsulation. |
| 🔹 **Visitor** | Represent an operation to be performed on elements of an object structure, without changing their classes. |

---

## ✨ Why Learn Design Patterns?

```
Without Patterns                     With Patterns
─────────────────────────────────    ─────────────────────────────────
❌ Reinventing solutions each time   ✅ Reuse proven, battle-tested designs
❌ Tight coupling between classes    ✅ Loosely coupled, modular architecture
❌ Hard to communicate design ideas  ✅ Shared vocabulary for your team
❌ Rigid code that resists change    ✅ Extensible systems that adapt easily
❌ Growing technical debt            ✅ Cleaner, more maintainable codebases
```

---

## 🗺️ Pattern Selection Guide

Not sure which pattern to use? Here's a quick decision guide:

- **Need only one instance of a class?** → `Singleton`
- **Creating objects without knowing the exact type?** → `Factory Method`
- **Dealing with incompatible interfaces?** → `Adapter`
- **Want to add features without subclassing?** → `Decorator`
- **Need to notify multiple objects of a change?** → `Observer`
- **Want to swap algorithms at runtime?** → `Strategy`
- **Need to undo/redo operations?** → `Command` + `Memento`
- **Simplifying a complex API?** → `Facade`

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. Fork this repository
2. Create a new branch (`git checkout -b feature/add-pattern`)
3. Commit your changes (`git commit -m 'Add example for Observer pattern'`)
4. Push to the branch (`git push origin feature/add-pattern`)
5. Open a Pull Request

Please ensure your examples include clear comments and follow consistent coding style.

---

## 📬 Connect with Me

I'm always happy to connect, collaborate, or discuss software design!

| Platform | Link |
|---|---|
| 🌐 Website | [www.sajithjeewantha.com](https://www.sajithjeewantha.com) |
| 💼 LinkedIn | [linkedin.com/in/sajith-jeewantha](https://www.linkedin.com/in/sajith-jeewantha) |

---

<div align="center">

⭐ **Found this helpful?** Give it a star and share it with fellow developers!

*"Design patterns are not a silver bullet — they are a shared language for building great software."*

</div>