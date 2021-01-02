/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        Collection<String> phoneCandidates = new ArrayList<>(phones);

        for (String phone : blacklist) {
            phoneCandidates.remove(phone);
        }

        return phoneCandidates;
    }
}

/* Please, do not modify this I/O code */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}