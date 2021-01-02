/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class CreateInstance {

    public static void main(String[] args) {
        SuperClass superClass = create();
        superClass.method1();
        superClass.method2();
        superClass.method3();
    }

    public static SuperClass create() {

        return new SuperClass() {

            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };
    }
}

// Don't change the code below

abstract class SuperClass {

    public static void method1() { }

    public void method2() { }

    public abstract void method3();
}