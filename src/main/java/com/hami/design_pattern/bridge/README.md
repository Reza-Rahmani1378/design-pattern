# Bridge Pattern
```
The Bridge Pattern’s intent is to decouple an abstraction from its implementation so that the two can vary independently. It puts the abstraction and implementation into two different class hierarchies so that both can be extend independently. The components of the Bridge Pattern comprise of an abstraction, refined abstraction, an implementer, and concrete implementer.
An abstraction defines the abstraction’s interface and also maintains a reference to an object of type implementer, and the link
between the abstraction and the implementer is called a Bridge.Refined Abstraction extends the interface defined by the abstraction.
The Implementer provides the interface for implementation classes (concrete implementers).
And the Concrete Implementer implements the Implementer interface and defines its concrete implementation.
The Bridge Pattern decouples the interface and the implementation. As a result, an implementation is not bound permanently to
an interface. The implementation of an abstraction can be configured at run-time. It also eliminates compile-time dependencies
on the implementation. Changing an implementation class doesn’t required recompiling the abstraction class and its clients. The
Client only needs to know about the abstraction and you can hide the implementation from them.
```

## Use of Bridge Pattern

- You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example,
  when the implementation must be selected or switched at run-time.
<br>
<br>
- Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern lets you
  combine the different abstractions and implementations and extend them independently.
<br>
<br>
- Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be
  recompiled.
<br>
<br>
- You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden
  from the client.