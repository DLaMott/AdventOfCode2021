package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Util {

    // Day 1 Part 1
    public static int getSumofIncreasePart1(List<Integer> y) {
        int change = 0;
        int last = -1;

        for (int sum : y) {
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

    // Day two Part 1
    public static int getDirectionPart1(List<String> y) {
        int position = 0;
        int depth = 0;
        for (String string : y) {
            var split = string.split(" ");
            switch (split[0]) {
                case "down" -> depth += Integer.parseInt(split[1]);
                case "up" -> depth -= Integer.parseInt(split[1]);
                case "forward" -> position += Integer.parseInt(split[1]);
            }
        }
        return position * depth;
    }

    // Day two part 2
    public static int getDirectionPart2(List<String> y) {
        int position = 0;
        int depth = 0;
        int aim = 0;
        for (String string : y) {
            var split = string.split(" ");
            switch (split[0]) {
                case "down" -> aim += Integer.parseInt(split[1]);
                case "up" -> aim -= Integer.parseInt(split[1]);
                case "forward" -> {
                    position += Integer.parseInt(split[1]);
                    depth += aim * Integer.parseInt(split[1]);
                }
            }
        }
        return position * depth;
    }

    // Day 3 part 1
    public static int mostCommonBit(List<String> y) {
        var gamma = new StringBuilder();
        var ep = new StringBuilder();

        for (int i = 0; i < y.get(0).length(); i++) {
            int one = 0;
            int zero = 0;

            for (String string : y) {
                if (string.charAt(i) == '1') {
                    ++one;
                } else {
                    ++zero;
                }
            }
            if (zero > one) {
                gamma.append("0");
                ep.append("1");
            } else {
                gamma.append("1");
                ep.append("0");
            }
        }
        return Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(ep.toString(), 2);
    }

    // Day 3 part 3
    public static int day3Part2(List<String> y) {
        var oxygen = day3Calculation(y, true);
        var co2 = day3Calculation(y, false);

        return oxygen * co2;
    }

    public static int day3Calculation(List<String> y, boolean most) {
        for (int i = 0; y.size() > 1; i++) {
            int zero = 0;
            int one = 0;

            for (String string : y) {
                if (string.charAt(i) == '1') {
                    ++one;
                } else {
                    ++zero;
                }
            }
            final var index = i;
            var target =
                    most ? (zero > one ? '0' : '1') : (one < zero ? '1' : '0');
            y = y.stream().filter(in -> in.charAt(index) == target).collect(Collectors.toList());
        }

        return Integer.parseInt(y.get(0), 2);
    }

    // Read file and return a list of integers
    // Enter correct file for testing
    public static List<Integer> readFileInt(String string) {
        // Todo: change to auto place correct file
        File file = new File(string);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer> integers = new ArrayList<>();
        while (true) {
            assert scanner != null;
            if (!scanner.hasNext()) break;
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        return integers;
    }

    // Create a list of string for parsing file
    // Enter correct file for testing
    public static List<String> readFileString(String string) {

        // Todo: change to auto place correct file
        File file = new File(string);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> strings = new ArrayList<>();
        while (true) {
            assert scanner != null;
            if (!scanner.hasNext()) break;
            if (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            } else {
                scanner.next();
            }
        }
        return strings;
    }
}
