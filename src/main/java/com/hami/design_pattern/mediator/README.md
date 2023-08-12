# Mediator Pattern

The Mediator Pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by
keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
Rather than interacting directly with each other, objects ask the Mediator to interact on their behalf which results in reusability
and loose coupling. It encapsulates the interaction between the objects and makes them independent from each other. This allows
them to vary their interaction with other objects in a totally different way by implementing a different mediator. The Mediator
helps to reduce the complexity of the classes. Each object no longer has to know in detail about how to interact with the other
objects. The coupling between objects goes from tight and brittle to loose and agile.

The Mediator design pattern should be your first choice any time you have a set of objects that are tightly coupled. If every one
of a series of objects has to know the internal details of the other objects, and maintaining those relationships becomes a problem,
think of the Mediator. Using a Mediator means the interaction code has to reside in only one place, and that makes it easier to
maintain. Using a mediator can hide a more serious problem: If you have multiple objects that are too tightly coupled, your
encapsulation may be faulty. It might be time to rethink how you’ve broken your program into objects.

Let’s look a more formal structure of the Mediator Pattern.

![](https://www.javacodegeeks.com/wp-content/uploads/2015/09/Mediatorclass_diagram_3.jpg)

The classess which hold reference of the mediator are called colleagues. The major participants of the Mediator Pattern are:

- Mediator: Defines an interface for communicating with Colleague objects.
- ConcreteMediator: Implements cooperative behavior by coordinating Colleague objects. It also knows and maintains its
  colleagues.
- Colleague Classes: Each Colleague class knows its Mediator object. Each colleague communicates with its mediator whenever
  it would have otherwise communicated with another colleague.

## When to use the Mediator Pattern
- A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult
  to understand.
- Reusing an object is difficult because it refers to and communicates with many other objects.
- A behavior that’s distributed between several classes should be customizable without a lot of sub-classing.