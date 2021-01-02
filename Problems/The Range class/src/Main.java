/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.io.Serializable;

/**
 * Represents inclusive integer range.
 */
class Range implements Serializable {

    private static final long serialVersionUID = 2L;

    /**
     * @serial
     */
    private final int from;
    /**
     * @serial
     */
    private final int to;

    /**
     * Creates Range.
     *
     * @param from start
     * @param to   end
     * @throws IllegalArgumentException if start is greater than end.
     */
    public Range(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("Start is greater than end");
        }
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        in.defaultReadObject();
        if (from > to) {
            throw new IllegalArgumentException("Start is greater than end");
        }
    }
}