/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        int queue1Load = 0;
        Queue<Integer> queue2 = new ArrayDeque<>();
        int queue2Load = 0;

        int taskCount = Integer.parseInt(SCANNER.nextLine());
        for (int i = 0; i < taskCount; i++) {
            int[] task = nextTask();
            if (queue1Load <= queue2Load) {
                queue1.offer(task[0]);
                queue1Load += task[1];
            } else {
                queue2.offer(task[0]);
                queue2Load += task[1];
            }
        }

        System.out.println(queue1.stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(queue2.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    private static int[] nextTask() {
        return Arrays.stream(SCANNER.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    }
}