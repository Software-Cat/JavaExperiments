class Test {
    public long get(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 1;
        } else {
            long accum = 1;
            for (int i = 1; i <= x; i++) {
                accum *= i;
            }
            return accum;
        }
    }
}
