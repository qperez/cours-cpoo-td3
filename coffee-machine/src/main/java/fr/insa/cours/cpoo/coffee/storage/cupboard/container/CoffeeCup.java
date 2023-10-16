package fr.insa.cours.cpoo.coffee.storage.cupboard.container;

import fr.insa.cours.cpoo.coffee.storage.cupboard.coffee.type.CoffeeType;

public class CoffeeCup extends CoffeeContainer{
    public CoffeeCup(double capacity, CoffeeType coffeeType) {
        super(capacity, coffeeType);
    }

    public CoffeeCup(Container container, CoffeeType coffeeType) {
        super(container, coffeeType);
    }
}
