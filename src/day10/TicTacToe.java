package day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char[][] gameTable = {
                {' ', ' ', ' ',},
                {' ', ' ', ' ',},
                {' ', ' ', ' ',}
        };
        if (new Random().nextBoolean()) {
            makeComputerMowe(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("You Win!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry Draw!");
                break;
            }
            makeComputerMowe(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("Computer Win!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry Draw!");
                break;
            }
        }
        System.out.println("Game Over");
    }

    private static void printTableMapping() {
        char[][] mappingTable = {
                {'7', '8', '9',},
                {'4', '5', '6',},
                {'1', '2', '3',}
        };
        printGameTable(mappingTable);
    }

    private static void printGameTable(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void makeUserMove(char[][] gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            String string = new Scanner(System.in).nextLine();
            if (string.length() == 1) {
                char ch = string.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    char[][] mappingTable = {
                            {'7', '8', '9',},
                            {'4', '5', '6',},
                            {'1', '2', '3',}
                    };
                    boolean flag = true;
                    for (int i = 0; i < mappingTable.length; i++) {
                        for (int j = 0; j < mappingTable.length; j++) {
                            if (mappingTable[i][j] == ch) {
                                if (gameTable[i][j] == ' ') {
                                    gameTable[i][j] = 'X';
                                    return;
                                } else {
                                    System.out.println("Can't make a move, because the cell is not free!");
                                    flag = false;
                                    break;
                                }
                            }
                        }
                        if (!flag) {
                            break;
                        }
                    }
                }

            }
        }
    }

    private static void makeComputerMowe(char[][] gameTable) {
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == ' ') {
                gameTable[row][col] = '0';
                return;
            }
        }
    }

    private static boolean isUserWin(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == 'X') {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (gameTable[0][j] == gameTable[1][j] && gameTable[0][j] == gameTable[2][j] && gameTable[0][j] == 'X') {
                return true;
            }
        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'X') {
            return true;
        }
        if (gameTable[2][0] == gameTable[1][1] && gameTable[2][0] == gameTable[0][2] && gameTable[2][0] == 'X') {
            return true;
        }
        return false;
    }

    private static boolean isComputerWin(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == '0') {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (gameTable[0][j] == gameTable[1][j] && gameTable[0][j] == gameTable[2][j] && gameTable[0][j] == '0') {
                return true;
            }
        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == '0') {
            return true;
        }
        if (gameTable[2][0] == gameTable[1][1] && gameTable[2][0] == gameTable[0][2] && gameTable[2][0] == '0') {
            return true;
        }
        return false;
    }

    private static boolean isDraw(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}