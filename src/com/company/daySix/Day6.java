package com.company.daySix;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class Day6 {
    public static void main(String[] args) {
        String input = readFile("src/com/company/daySix/day6input").trim();

        long res = 0;
        long[] fishCounter = new long[9];
        String[] parts = input.split(",");
        for (String part : parts) {
            fishCounter[parseInt(part)]++;
        }

        for (int i = 0; i < 256; i++) {
            long zeroes = fishCounter[0];
            for (int j = 0; j < 8; j++) {
                fishCounter[j] = fishCounter[j+1];
            }
            fishCounter[8] = zeroes;
            fishCounter[6] += zeroes;
        }
        for (long x : fishCounter) {
            res += x;
        }
        System.out.println(res);
    }

    public static String readFile(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Couldn't find path specified");
            return "";
        }
    }
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }


}
