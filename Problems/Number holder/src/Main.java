/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Holder<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}