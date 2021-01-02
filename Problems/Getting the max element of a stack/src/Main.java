/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        int commandCount = Integer.parseInt(SCANNER.nextLine());

        for (int i = 0; i < commandCount; i++) {
            String[] command = SCANNER.nextLine().split("\\s");

            switch (command[0]) {
                case "push":
                    int intToPush = Integer.parseInt(command[1]);
                    stack.push(intToPush);

                    if (stack.size() == 1) {
                        maxStack.push(intToPush);
                        break;
                    }
                    if (intToPush > maxStack.peek()) {
                        maxStack.push(intToPush);
                    } else {
                        maxStack.push(maxStack.peek());
                    }
                    break;
                case "pop":
                    stack.pop();
                    maxStack.pop();
                    break;
                case "max":
                    System.out.println(maxStack.peek());
                    break;
            }
        }

    }
}