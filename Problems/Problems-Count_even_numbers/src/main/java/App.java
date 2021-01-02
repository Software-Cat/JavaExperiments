/*
 * Copyright © Bowen Wu 2021.
 * All rights reserved.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\Programming\\Java\\Battleship\\Problems\\Problems-Count_even_numbers\\src\\main\\resources\\dataset_91065.txt");

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                } else if (num % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
