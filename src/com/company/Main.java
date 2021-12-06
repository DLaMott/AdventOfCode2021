package com.company;

import com.company.dayFive.day5Parts;
import com.company.dayFour.Day4Calc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Advent of code 2021

public class Main {
    // DAY 1 Requirements
    // Create a counter and store a value each time a number is higher then a previous one for file attached'


    public static void main(String[] args) {

        var something = Util.readFileInt("src/com/company/instructions/day1/input.txt");
        var something2 = Util.readFileString("src/com/company/instructions/day3/input3.txt");
        var day5  =(ArrayList) Util.readFileString("src/com/company/dayFive/day5");


        boolean validEntry = true;

        while (validEntry) {

            System.out.println("-----Advent of Code 2021!-----");
            System.out.println("-----User Menu-----");
            System.out.println("Day 1: 1\nDay 2: 2\nDay 3: 3\nDay 4: 4\nDay 5: 5\nExit: 6\nEnter option: ");

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
                    System.out.println("Day 4:");
                    System.out.println("35670\n22704");
                    break;
                case "5":
                    System.out.println(day5Parts.part1(day5));
                    System.out.println(day5Parts.partTwo(day5));
                    break;
                case "6":
                    validEntry = false;
                    break;
                default:
                    System.out.println("Incorrect option try again.");
                    break;
            }
        }
    }
}