# Strategy pattern

*"Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable."* - [source](https://refactoring.guru/design-patterns/strategy)

## Class diagram

![class-diagram](class-diagram.svg)

## Example

Main.java:

```java
Duck duck1 = new Duck(new WildDuckQuack());
Duck duck2 = new Duck(new WildDuckQuack());
Duck duck3 = new Duck(new WildDuckQuack());
Duck[] ducksArmy = new Duck[] {duck1, duck2, duck3};

System.out.println("Ducks Army: We are wild ducks!!");
for(Duck duck : ducksArmy) {
    duck.quack();
}

System.out.println("Ducks Army: We are downgraded to rubber ducks!!");
for(Duck duck : ducksArmy) {
    duck.mutateQuack(new RubberDuckQuack());
    duck.quack();
}
```
Output:

```bash
Ducks Army: We are wild ducks!!
I am a wild duck!
I am a wild duck!
I am a wild duck!
Ducks Army: We are downgraded to rubber ducks!!
I am a rubber duck!
I am a rubber duck!
I am a rubber duck!
```