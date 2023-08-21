# Chain Of Responsibility

## What is The Chain Of Responsibility?

The intent of this pattern is to avoid coupling the sender of a request to its receiver by giving more than one object a
chance to handle the request. We chain the receiving objects and pass the request along the chain until an object
handles it. This pattern is all about connecting objects in a chain of notification; as a notification travels down the
chain, it’s handled by the first object that is set up to deal with the particular notification. When there is more than
one objects that can handle or fulfill a client request, the pattern recommends giving each of these objects a chance to
process the request in some sequential order. Applying the pattern in such a case, each of these potential handlers can
be arranged in the form of a chain, with each object having a reference to the next object in the chain. The first
object in the chain receives the request and decides either to handle the request or to pass it on to the next object in
the chain. The request flows through all objects in the chain one after the other until the request is handled by one of
the handlers in the chain or the request reaches the end of the chain without getting processed.


## When to use the Chain Of Responsibility Pattern?

- More than one objects may handle a request, and the handler isn’t known a priori. The handler should be ascertained automatically.
- You want to issue a request to one of several objects without specifying the receiver explicitly.
- The set of objects that can handle a request should be specified dynamically.