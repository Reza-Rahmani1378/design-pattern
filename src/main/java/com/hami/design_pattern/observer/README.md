# Observer Pattern

The Observer Pattern is a kind of behavior pattern which is concerned with the assignment of responsibilities between objects.The behavior patterns characterize complex control flows that are difficult to follow at run-time. They shift your focus away from the flow of control to let you concentrate just on the way objects are interconnected.
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents
are notified and updated automatically. The Observer pattern describes these dependencies. The key objects in this pattern are
subject and observer. A subject may have any number of dependent observers. All observers are notified whenever the subject
undergoes a change in its state. In response, each observer will query the subject to synchronize its state with the subject state.
The other way to understand the Observer Pattern is the way Publisher-Subscriber relationship works. Let’s assume for example
that you subscribe to a magazine for your favorite sports or fashion magazine. Whenever a new issue is published, it gets delivered
to you. If you unsubscribe from it when you don’t want the magazine anymore, it will not get delivered to you. But the publisher
continues to work as before, since there are other people who are also subscribed to that particular magazine.

[](https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FObserver_pattern&psig=AOvVaw2Zw6dXdFR_2FG_5dWukmgV&ust=1691920789387000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOi_jp_u1oADFQAAAAAdAAAAABAE)
## There are four participants in the Observer pattern

- Subject, which is used to register observers. Objects use this interface to register as observers and also to remove themselves
  from being observers.
- Observer, defines an updating interface for objects that should be notified of changes in a subject. All observers need to
  implement the Observer interface. This interface has a method update(), which gets called when the Subject’s state changes.
- ConcreteSubject, stores the state of interest to ConcreteObserver objects. It sends a notification to its observers when its state
  changes. A concrete subject always implements the Subject interface. The notifyObservers() method is used to update
  all the current observers whenever the state changes.
- ConcreateObserver, maintains a reference to a ConcreteSubject object and implements the Observer interface. Each observer
  registers with a concrete subject to receive updates.

## When to use the Observer Pattern

- When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary
  and reuse them independently.
- When a change to one object requires changing others, and you don’t know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. In other words,
  you don’t want these objects tightly coupled.

