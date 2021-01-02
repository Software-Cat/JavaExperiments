/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Holder<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class Main {
    public static void main(String... args) {
        // initialize an instance of Holder to make the code below compiled
        var holder = new Holder<String>();

        // do not change the code below
        holder.set("This is an instance of String");

        String value = holder.get();
        System.out.println(value);
    }
}