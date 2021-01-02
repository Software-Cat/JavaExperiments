/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    public void putTreeTopper(String color) {
        TreeTopper topper = new TreeTopper(color);
        topper.sparkle();
    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        public void sparkle() {
            StringBuilder sb = new StringBuilder();
            sb.append("Sparkling ");
            sb.append(color);
            sb.append(" tree topper looks stunning with ");
            sb.append(ChristmasTree.this.color);
            sb.append(" Christmas tree!");
            System.out.println(sb);
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}