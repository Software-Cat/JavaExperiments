/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> availableWordCount = new HashMap<>();
        String[] availableWords = SCANNER.nextLine().split("\\s+");
        for (String word : availableWords) {
            if (availableWordCount.containsKey(word)) {
                availableWordCount.put(word, availableWordCount.get(word) + 1);
            } else {
                availableWordCount.put(word, 1);
            }
        }

        Map<String, Integer> requiredWordCount = new HashMap<>();
        String[] requiredWords = SCANNER.nextLine().split("\\s+");
        for (String word : requiredWords) {
            if (requiredWordCount.containsKey(word)) {
                requiredWordCount.put(word, requiredWordCount.get(word) + 1);
            } else {
                requiredWordCount.put(word, 1);
            }
        }

        boolean screwed = false;
        for (var requirement : requiredWordCount.entrySet()) {
            if (!availableWordCount.containsKey(requirement.getKey())) {
                screwed = true;
                break;
            } else if (availableWordCount.get(requirement.getKey()) < requirement.getValue()) {
                screwed = true;
                break;
            }
        }

        if (screwed) {
            System.out.println("You are busted");
        } else {
            System.out.println("You get money");
        }
    }
}