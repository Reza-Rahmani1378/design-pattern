# Adapter Pattern

In the above code, we have created an Adapter(XpayToPayDAdapter). The adapter implements the PayD interface, as it
is required to mimic like a PayD type of object. The adapter uses object composition to hold the object, it’s supposed to be
adapting, an Xpay type of object. The object is passed into the adapter through its constructor.
Now, please note that we have two incompatible types of interfaces, which we need to fit together using an adapter in order to
make the code work. These two interfaces have a different set of methods. But the sole purpose of these interfaces is very much
similar, i.e. to provide the customer and credit card info to their specific vendors.
The setProp() method of the above class is used to set the xpay’s properties into the payD’s object. We set the methods
which are similar in work in both the interfaces. However, there is only single method in PayD interface to set the month
and the year of the credit card, as opposed to two methods in the Xpay interface. We joined the result of the two methods
of the Xpay object (this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear()) and sets it into the
setCardExpMonthDate() method.

## When use the Adapter Pattern?

- There is an existing class, and its interface does not match the one you need.
  <br>
  <br>
- You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don’t necessarily
  have compatible interfaces.
<br>
<br>
- There are several existing subclasses to be use, but it’s impractical to adapt their interface by subclassing every one. An object
  adapter can adapt the interface of its parent class.