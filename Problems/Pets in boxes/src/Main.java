/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

/*
To detect and memorize whether extends or super should be used,
it is worth remembering the Get and Put principle:

Use Upper Bounded Wildcards (i.e., <? extends Number>) when you
only get values out of a structure (when you use only getters
or similar methods), use Lower Bounded Wildcards
(i.e., <? super Integer>) when you only put values into a
structure (when you use only setters or similar methods) and do
use Unbounded Wildcards (simple <?>) when you both get and put
(when it is essential for you to use all kind of methods).

To memorize this principle,
you can also use PECS: Producer Extends, Consumer Super.
This means that if you get a value from a generic class,
method or any other object (it can produce for you what you need),
you use extends. And vice versa, if you put or set a value into a
generic class, method or any other object (it can consume what you put in it),
you use super.

Remember, that it is not possible to put anything into a type declared
with an extends wildcard except for the null value since it can represent
any reference type. Similarly, it is not possible to get anything
from a type declared with super wildcard except for a value of an
Object type: a super type for every reference type.
 */

class BoxInside {

    // Complete this method
    public static void showAnimal(Box<? extends Animal> box) {
        System.out.println(box.getAnimal().toString());
    }
}

// Don't change the code below
class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Box<T> {

    private T animal;

    T getAnimal() {
        return animal;
    }

    void setAnimal(T animal) {
        this.animal = animal;
    }
}