# Abstract Factory Pattern

## Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

[Wikipedia](https://en.wikipedia.org/wiki/Abstract_factory_pattern)

![Abstract Factory schema](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Abstract_factory.svg/517px-Abstract_factory.svg.png)


#### Improvement from Java to Kotlin:
None (just a bit more readable)

#### How to improve:
By using a proper DI solution, you will avoid to specify the concrete factory type in the main. This instantiation will be done by the DI itself.
See for example: http://google.github.io/dagger/

