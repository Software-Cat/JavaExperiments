/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String intListString = SCANNER.nextLine();
        List<Integer> intList = new ArrayList<>();
        String[] intListStringParts = intListString.split(" ");
        for (String part : intListStringParts) {
            intList.add(Integer.parseInt(part));
        }

        int matchingInt = Integer.parseInt(SCANNER.nextLine());

        StringBuilder sb = new StringBuilder();
        for (Integer i : closestInts(intList, matchingInt)) {
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb);
    }

    private static List<Integer> closestInts(List<Integer> ints, int matching) {
        ArrayList<Integer> closestInts = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;

        for (Integer i : ints) {
            int distance = Math.abs(i - matching);
            if (distance < minDistance) {
                minDistance = distance;
                closestInts.clear();
                closestInts.add(i);
            } else if (distance == minDistance) {
                closestInts.add(i);
            }
        }

        Collections.sort(closestInts);

        return closestInts;
    }
}