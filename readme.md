# Design Patterns

This is a repository with collection of design patterns written in Java.

## Context

In many interviews, I've been asked about design patterns. Talking about patterns is a nice conversation, but it is even better when you can support this conversation with real examples or some coding examples. 

I created this repository for that purpose. The examples may not be perfect or differ from traditional books. These differences are also a good opportunity for interviews and debate.


## Index

- Creational patterns
  - [Singleton](./Singleton/readme.md)
  - [Factory method](./FactoryMethod/readme.md)
  - [Abstract Factory](./AbstractFactory/readme.md)
  - [Builder](./Builder/readme.md)
  - [Prototype](./Prototype/readme.md)
- Structural patterns
  - [Adapter](./Adapter/readme.md)
  - [Decorator](./Decorator/readme.md)
  - [Composite](./Composite/readme.md)
  - [Proxy](./Proxy/readme.md)
  - [Facade](./Facade/readme.md)
  - [Bridge](./Bridge/readme.md)
  - [Flyweight](./Flyweight/readme.md)
- Behavioural patterns
  - [State](./State/readme.md)
  - [Strategy](./Strategy/readme.md)
  - [Observer](./Observer/readme.md)
  - [Iterator](./Iterator/readme.md)
  - [Chain of Responsibility](./ChainOfResponsibility/readme.md)
  - [Mediator](./Mediator/readme.md)
  - [Template Method](./TemplateMethod/readme.md)
  - [Command](./Command/readme.md)

## Class diagrams generation

The class diagrams are generated using [PlantUML](https://github.com/plantuml/plantuml).

You can generate the class diagram images from the corresponding markdown file code using inline plantUML syntax. 

```bash
plantuml -tsvg ./Adapter/readme.md
```

You can also use the plantuml jar file from the root folder. 

```bash
java -jar plantuml-mit-1.2024.4.jar ./Adapter/class-diagram.txt -tsvg
```

## Sources

- [Head First Design Patterns: A Brain-Friendly Guide](https://www.amazon.es/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124)
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.es/Design-Patterns-Object-Oriented-professional-computing/dp/0201633612/ref=sr_1_1?crid=30YLYC2BJ44GZ&dib=eyJ2IjoiMSJ9.mTRaTOPYqsPcUsGD8azntQBwoQYmLa7486oAF-n21nbQ7yYTsdNkG3R4XYMdy6UdpS6Iz5lg8NdWCrTCapG5YAoOIBWjwu5J4NTr08k4JTKngAO65WDusp74lJ0GZFV9ytGeE-_150kxgn6KlJwa3gJ2b09-rUZnwcDo8jQKggZ8tD97TlUGSwZuVebyUW3d1ebt9zIVVO9vwIGCgZPDxlob_9Vwbja5woc0qbdV4XhItfaxsqv-RzLmxqLG1FoFjXu41IPBTJNRw5lYKmpQrCY9YZdBMZ3puvIM7WcoCRE.5L5CrPNNq1b77Mpj0sUDS0s8VMkPUbeILkQ5FNnSJUs&dib_tag=se&keywords=design+patterns&qid=1714663646&sprefix=design+pa%2Caps%2C114&sr=8-1)
- [Christopher Okhravi](https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)
- [refactoring.guru](https://refactoring.guru/design-patterns/)