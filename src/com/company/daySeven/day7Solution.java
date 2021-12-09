package com.company.daySeven;

import com.company.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class day7Solution {

    public static void main(String args[]) {

        try {
            File inputFile = new File("src/com/company/daySeven/input7.txt");
            Scanner kB = new Scanner(inputFile);
            List<Integer> crabList = new ArrayList<Integer>(0);
            crabList = Arrays.stream(kB.nextLine().split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
            int lowestCost = 1000000;
            for (Integer crab : crabList) {
                int cost = 0;
                for (int i = 0; i < crabList.size(); i++) {
                    cost += Math.abs(crabList.get(i) - crab);
                }
                if (cost < lowestCost) lowestCost = cost;
            }
            System.out.println(lowestCost);
            kB.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            File inputFile = new File("src/com/company/daySeven/input7.txt");
            Scanner kB = new Scanner(inputFile);
            List<Integer> crabList = new ArrayList<Integer>(0);
            crabList = Arrays.stream(kB.nextLine().split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
            int lowestCost = 100000000;
            int biggestNum = 0;
            for (int i = 0; i < crabList.size(); i++) {
                if (crabList.get(i) > biggestNum) biggestNum = crabList.get(i);
            }
            for (int j = 0; j < biggestNum; j++) {
                int cost = 0;
                for (int i = 0; i < crabList.size(); i++) {
                    cost += Math.abs(j - crabList.get(i)) * (1 + Math.abs(j - crabList.get(i))) / 2;
                }
                if (cost < lowestCost) lowestCost = cost;
            }
            System.out.println(lowestCost);
            kB.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}