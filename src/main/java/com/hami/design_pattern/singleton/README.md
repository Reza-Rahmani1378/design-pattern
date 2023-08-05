# Singleton Pattern

Sometimes it’s important for some classes to have exactly one instance. There are many objects we only need one instance
of them and if we, instantiate more than one, we’ll run into all sorts of problems like incorrect program behavior, overuse of
resources, or inconsistent results.
You may require only one object of a class, for example, when you are a creating the context of an application, or a thread
manageable pool, registry settings, a driver to connect to the input or output console etc. More than one object of that type
clearly will cause inconsistency to your program.
The Singleton Pattern ensures that a class has only one instance, and provides a global point of access to it. However, although
the Singleton is the simplest in terms of its class diagram because there is only one single class, its implementation is a bit trickier.