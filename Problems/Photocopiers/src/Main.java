/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;

interface Copy<T> {
    T copy();
}

class Folder<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

/**
 * Class to work with
 */
class Multiplicator {
    /**
     * Multiply folders and put copies of original folder argument content in each.
     *
     * @param folder    folder which content should be multiplicated
     * @param arraySize size of array to return.
     *                  Each array element should have Folder with copy of the original content inside
     * @return array of Folder<T>[] objects
     */
    public static <T extends Copy<T>> Folder<T>[] multiply(Folder<T> folder, int arraySize) {
        ArrayList<Folder<T>> copies = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            Folder<T> copy = new Folder<>();
            copy.put(folder.get().copy());
            copies.add(copy);
        }
        return copies.toArray(new Folder[copies.size()]);
    }
}
