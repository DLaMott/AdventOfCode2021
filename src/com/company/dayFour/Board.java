package com.company.dayFour;

import java.util.Scanner;

public class Board {
    private final int[][] boardArray;
    private final int rows;
    private final int cols;

    public Board(Scanner read, int rows, int cols){
        boardArray = new int[rows][cols];
        this.rows =rows;
        this.cols =cols;

        for(int i = 0; i < rows; i++){
            String holder = read.nextLine();
            Scanner scanner = new Scanner(holder);
            for (int x = 0; x < cols; x++){
                boardArray[i][x] = scanner.nextInt();
            }
        }
    }

    public void playBingo(int idk){
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if (boardArray[i][j] == idk) {
                    boardArray[i][j] = -1;
                }
            }
        }
    }
    public boolean isWinner() {
        for(int i = 0; i < rows; i++) {
            boolean winner = true;
            for (int j = 0; j < cols; j++){
                if (boardArray[i][j] != -1) {
                    winner = false;
                    break;
                }
            }
            if (winner) {
                return true;
            }
        }
        for(int i = 0; i < rows; i++) {
            boolean winner = true;
            for (int j = 0; j < cols; j++){
                if (boardArray[j][i] != -1) {
                    winner = false;
                    break;
                }
            }
            if (winner) {
                return true;
            }
        }
        return false;
    }
    public int unmarkedNumbersTotal(){
        int total = 0;
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if (boardArray[i][j] != -1) {
                    total += boardArray[i][j];
                }
            }
        }
        return total;
    }



}
