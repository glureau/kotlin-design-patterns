# Adapter Pattern

## An adapter helps two incompatible interfaces to work together. 
Generally it's handy when you need to use an external library or a legacy code and you don't want (or cannot) change the external code.

When you have all the source code, it's often preferable to use a delegate pattern and re-use the interface.

[Wikipedia](https://en.wikipedia.org/wiki/Adapter_pattern)

![Adapter schema](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/ObjectAdapter.png/300px-ObjectAdapter.png)

#### Improvement from Java to Kotlin:
In Java, classes are by default non-final, but it's  often a good practice to put final on all final objects.
At the opposite, Kotlin will ensure by default you're overriding only when it's explicitely specified with keywords 'open' (on the non-final class) and 'override' (on methods). 

#### Bonus:
Demonstrates how to adapt a Java class.

