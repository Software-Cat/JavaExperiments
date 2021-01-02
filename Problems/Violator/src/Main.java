/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/* This class and its subclasses should pass quality check */
class Bakery {
}

class Cake extends Bakery {
}

/* This one should not */
class Paper {
}

/* These boxes are used to pack stuff */
class Box<T> {
    T item;

    void put(T item) { /* implementation omitted */ }

    T get() {
        return item;
    }
}

/* This quality checker ensures that boxes for sale contain Bakery and anything else */
class NaiveQualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
    /* Method signature guarantees that all illegal
       calls will produce compile-time error... or not? */
        return true;
    }

}

/**
 * Class to work with
 */
class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        List boxes = new ArrayList<>();
        Box paperBox = new Box();
        paperBox.put(new Paper());
        boxes.add(paperBox);
        return boxes;
    }
}