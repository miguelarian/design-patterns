# Builder pattern

*"Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code."* - [source](https://refactoring.guru/design-patterns/builder)

I implemented two versions of this pattern: classic and fluent.

A third version was also added using [Lombok project](https://www.baeldung.com/intro-to-project-lombok) @Builder annotation.

## Builder pattern (classic version)

![class-diagram-classic](class-diagram-classic.svg)

## Example

Main.java:

```java
MenuBuilder americanMenuBuilder = new AmericanMenuBuilder();
americanMenuBuilder.beverage("Cola");
americanMenuBuilder.appetizer("Chicken Wings");
americanMenuBuilder.main("Burger");
americanMenuBuilder.side("Fries");
americanMenuBuilder.dessert("Milkshake");

Menu americanMenu = americanMenuBuilder.order();
System.out.println(americanMenu);

MenuBuilder italianMenuBuilder = new ItalianMenuBuilder();
italianMenuBuilder.beverage("Spritz");
italianMenuBuilder.appetizer("Focaccia");
italianMenuBuilder.main("Pizza Margarita");
italianMenuBuilder.side("Caprese Salad");
italianMenuBuilder.dessert("Pandoro");

Menu italianMenu = italianMenuBuilder.order();
System.out.println(italianMenu);
```
Output:

```bash
Menu{appetizer='Chicken Wings', main='Burger', side='Fries', beverage='Cola', dessert='Milkshake'}
Menu{appetizer='Focaccia', main='Pizza Margarita', side='Caprese Salad', beverage='Spritz', dessert='Pandoro'}
```

## Builder pattern (fluent version)

![class-diagram-fluent](class-diagram-fluent.svg)

## Example

Main.java:

```java
Pizza customPizza = new PizzaBuilder()
                .withAmericanBase()
                .withTomatoSauce()
                .addTopping("york")
                .addTopping("cheese")
                .addTopping("mushroom")
                .cookPizza();
System.out.println("My custom pizza: " + customPizza);

Pizza cheesyPizza = new PizzaBuilder()
                    .cookCheesyPizza();
System.out.println("A cheesy pizza: " + cheesyPizza);

Pizza pepperoniPizza = new PizzaBuilder()
                    .cookPepperoniPizza();
System.out.println("A pepperoni pizza: " + pepperoniPizza);
```
Output:

```bash
My custom pizza: american, tomato, york, cheese, mushroom
A cheesy pizza: thin, tomato, cheese, cheese, cheese
A pepperoni pizza: standard, tomato, cheese, pepperoni, chorizo
```

## Builder pattern (Lombok)

About [project Lombok](https://projectlombok.org/features/Builder)

## Example

Main.java:

```java
Menu menu = Menu.builder()
                .beverage("Cola")
                .appetizers("Chicken Wings")
                .side("Fries")
                .main("Cheese Burger")
                .dessert("Milkshake")
                .build();

System.out.println(menu);
```
Output:

```bash
Menu{appetizers='Chicken Wings', main='Cheese Burger', side='Fries', beverage='Cola', dessert='Milkshake'}
```
