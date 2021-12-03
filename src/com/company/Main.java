package com.company;

import java.io.File;
// Advent of code 2021

public class Main {
    // DAY 1 Requirements
    // Create a counter and store a value each time a number is higher then a previous one for file attached'


    public static void main(String[] args) {

        // Grab list from file
        var something = Util.readFileInt();
        // Display results to console
        System.out.println(Util.getSumofIncreasePart1(something));
        System.out.println(Util.getSumOfIncreasePart2(something));
    }


}