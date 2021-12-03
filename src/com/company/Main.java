package com.company;

import java.io.File;
import java.util.Scanner;
// Advent of code 2021

public class Main {
    // DAY 1 Requirements
    // Create a counter and store a value each time a number is higher then a previous one for file attached'


    public static void main(String[] args) {

        var something = Util.readFileInt();
        var something2 = Util.readFileString();

        boolean validEntry = true;

        while (validEntry) {

            System.out.println("-----Advent of Code 2021!-----");
            System.out.println("-----User Menu-----");
            System.out.println("Day 1: 1\nDay 2: 2\nDay 3: 3\nExit: 4\nEnter option: ");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {

                case "1":
                    System.out.println("Day 1:");
                    System.out.println(Util.getSumofIncreasePart1(something));
                    System.out.println(Util.getSumOfIncreasePart2(something));
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Day 2:");
                    System.out.println(Util.getDirectionPart1(something2));
                    System.out.println(Util.getDirectionPart2(something2));
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Day 3:");
                    System.out.println(Util.mostCommonBit(something2));
                    System.out.println(Util.day3Part2(something2));
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Exiting, Goodbye!");
                    validEntry = false;
                default:
                    System.out.println("Incorrect option try again.");
                    break;
            }
        }
    }
}