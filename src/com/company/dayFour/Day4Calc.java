package com.company.dayFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4Calc {
    public static void main(String[] args){
        File f = new File("src/com/company/dayFour/inputs3");
        Scanner reader = null;
        List<Board> boards = new ArrayList<>();
        List<Board> boardsAlreadyWon = new ArrayList<>();
        String[] numbersDrawn = new String[0];
        List<Integer> results = new ArrayList<>();

        try {
            reader = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(true) {
            assert reader != null;
            if (!reader.hasNextLine()) break;
            numbersDrawn = reader.nextLine().split(",");
            while(true) {
                if (!reader.hasNextLine()) break;
                reader.nextLine();
                boards.add(new Board(reader, 5, 5));
                if (!reader.hasNextLine()) break;

            }
        }

        for (String numberDrawn : numbersDrawn) {
            for (Board board : boards) {
                board.playBingo(Integer.parseInt(numberDrawn));
            }
            for (Board board : boards) {
                if(board.isWinner()) {
                    results.add(board.unmarkedNumbersTotal() * Integer.parseInt(numberDrawn));
                    boardsAlreadyWon.add(board);
                }
            }
            for (Board board : boardsAlreadyWon) {
                boards.remove(board);
            }
        }

        System.out.println(results.get(0));
        System.out.println(results.get(results.size()-1));
    }
}
