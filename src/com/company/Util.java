package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {

// Day 1 Part 1
    public static int getSumofIncreasePart1(List<Integer> y) {
        int change = 0;
        int last = -1;

        for (int x = 0; x < y.size(); x++) {
            int sum = y.get(x);
            if (last != -1 && last < sum) {
                ++change;
            }
            last = sum;
        }

        return change;
    }
// Day 1 Part 2
    public static int getSumOfIncreasePart2(List<Integer> y) {
        int increase = 0;
        int count = -1;
        for (int i = 2; i < y.size(); ++i) {
            int sum = y.get(i) + y.get(i - 1) + y.get(i - 2);
            if (count != -1 && count < sum) {
                ++increase;
            }
            count = sum;
        }
        return increase;
    }


    // Read file and return a list of integers
    public static List<Integer> readFileInt() {

        File file = new File("src/com/company/input.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        return integers;
    }

}
