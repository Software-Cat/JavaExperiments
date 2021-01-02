/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.*;

class Main {

    static final Scanner SCANNER = new Scanner(System.in);
    static ArrayList<String> decompositionSuffixes;

    public static void main(String[] args) {
        int n = SCANNER.nextInt();

        decompositionSuffixes = new ArrayList<String>();

        decompose(n, n, "");

        Collection<List<Integer>> decompositions = new ArrayList<>();
        for (String suffix : decompositionSuffixes) {
            List<Integer> decomposition = new ArrayList<>();
            for (String component : suffix.split(" ")) {
                decomposition.add(Integer.parseInt(component));
            }
            decompositions.add(decomposition);
        }

        for (List<Integer> suffix : decompositions) {
            Collections.sort(suffix);
        }

        for (List<Integer> suffix : decompositions) {
            Collections.reverse(suffix);
        }

        for (List<Integer> suffix : decompositions) {
            for (Integer component : suffix) {
                System.out.print(component);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void decompose(int target, int maxValue, String suffix) {
        if (target == 0)
            decompositionSuffixes.add(suffix);
        else {
            if (maxValue > 1)
                decompose(target, maxValue-1, suffix);
            if (maxValue <= target)
                decompose(target-maxValue, maxValue, maxValue + " " + suffix);
        }
    }
}