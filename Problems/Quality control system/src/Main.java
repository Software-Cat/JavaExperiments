/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.List;

class QualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
        try {
            if (boxes == null) {
                return false;
            }

            for (Box<? extends Bakery> box : boxes) {
                if (box == null) {
                    return false;
                }

                if (box.get() == null) {
                    return false;
                }

                if (!(box.get() instanceof Bakery)) {
                    return false;
                }
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

// Don't change the code below
class Bakery {
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}

class Paper {
}

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}