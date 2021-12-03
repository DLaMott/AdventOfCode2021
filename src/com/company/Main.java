package com.company;

import java.io.File;
// Advent of code 2021

public class Main {
    // DAY 1 Requirements
    // Create a counter and store a value each time a number is higher then a previous one for file attached'


    public static void main(String[] args) {

        // Create lists needed from files
        var something = Util.readFileInt();
        var something2 = Util.readFileString();
        // Display results to console
        System.out.println(Util.getSumofIncreasePart1(something));
        System.out.println(Util.getSumOfIncreasePart2(something));
        System.out.println(Util.getDirectionPart1(something2));
        System.out.println(Util.getDirectionPart2(something2));
    }


}