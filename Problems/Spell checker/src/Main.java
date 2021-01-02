/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.*;
import java.util.stream.Collectors;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> knownWords = new HashSet<>(nextLines(Integer.parseInt(SCANNER.nextLine())));
        knownWords = knownWords.stream().map(String::toLowerCase).collect(Collectors.toSet());

        List<String> textLines = nextLines(Integer.parseInt(SCANNER.nextLine()));

        Set<String> textWords = new HashSet<>();
        for (String line : textLines) {
            textWords.addAll(Arrays.stream(line.split("\\s")).map(String::toLowerCase).collect(Collectors.toSet()));
        }

        Set<String> unknownWords = new HashSet<>();
        for (String word : textWords) {
            if (!knownWords.contains(word)) {
                unknownWords.add(word);
            }
        }

        for (String word : unknownWords) {
            System.out.println(word);
        }
    }

    private static List<String> nextLines(int lineCount) {
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < lineCount; i++) {
            lines.add(SCANNER.nextLine());
        }

        return lines;
    }
}