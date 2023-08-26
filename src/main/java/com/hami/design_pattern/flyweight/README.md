# Flyweight Pattern


## What is the flyweight pattern?
The intent of the Flyweight Pattern is to use shared objects to support large numbers of fine-grained objects efficiently. A
flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in
each context - it’s indistinguishable from an instance of the object that’s not shared. Flyweights cannot make assumptions about
the context in which they operate. The key concept here is the distinction between intrinsic and extrinsic state. **Intrinsic state** is
stored in the flyweight; it consists of information that’s independent of the flyweight’s context, thereby making it sharable. The
**extrinsic state** depends on and varies with the flyweight’s context and therefore can’t be shared. Client objects are responsible
for passing extrinsic state to the flyweight when it needs it.

Consider an application scenario that involves creating a large number of objects that are unique only in terms of a few parameters.
In other words, these objects contain some intrinsic, invariant data that are common among all objects. This intrinsic data needs
to be created and maintained as part of every object that is being created. The overall creation and maintenance of a large group
of such objects can be very expensive in terms of memory-usage and performance. The Flyweight pattern can be used in such
scenarios to design a more efficient way of creating objects.

Here is the class diagram for the Flyweight design pattern:

![](https://www.javacodegeeks.com/wp-content/uploads/2015/09/flyweight_class_diagram.jpg)

### Flyweight

- Declares an interface through which flyweights can receive and act on extrinsic state.

### ConcreteFlyweight

- Implements the Flyweight interface and adds storage for intrinsic state, if any. A ConcreteFlyweight object must be sharable.
  Any state it stores must be intrinsic; that is, it must be independent of the ConcreteFlyweight object’s context.

### FlyweightFactory

- Creates and manages flyweight objects.
- Ensures that flyweights are shared properly. When a client requests a flyweight, the FlyweightFactory object supplies an
  existing instance or creates one, if none exists.

### Flyweight

- Maintains a reference to flyweight(s).
- Computes or stores the extrinsic state of flyweight(s).


## When use the Flyweight Pattern?

- An application uses a large number of objects.
- Storage costs are high because of the sheer quantity of objects.
- Most object state can be made extrinsic.
- Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
- The application does not depend on object identity. Since flyweight objects may be shared, identity tests will return true for
  conceptually distinct objects.


