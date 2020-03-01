package lesson4;

import java.util.Random;
import java.util.Scanner;

public class FirstGame {
    static final int SIZE = 7;
    static int DOTS_TO_WIN = 5;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (newCheckWin(DOT_X)) {
                System.out.println(" Вы победили !!! ");
                break;
            }

            if (isFull()) {
                System.out.println(" Ничья ");
                break;
            }

            aiTurn();
            printMap();

            if (isFull()) {
                System.out.println(" Ничья ");
                break;
            }

            if (newCheckWin(DOT_O)) {
                System.out.println(" Компьютер обыграл Вас! ");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println(" Введите координаты в формате Y X ");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;

        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (newCheckWin(DOT_O)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (newCheckWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;

    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkLine(int ay, int ax, int by, int bx, char symbol) {
        if (ax + bx * DOTS_TO_WIN - 1 > SIZE - 1 || ay + by * DOTS_TO_WIN - 1 > SIZE - 1 || ay + by * DOTS_TO_WIN < 0) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[ay + i * by][ax + i * bx] != symbol) {
                return false;
            }
        }
        return true;
    }

    static boolean newCheckWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, symbol) || checkLine(i, j, 1, 0, symbol) ||
                        checkLine(i, j, 1, 1, symbol) || checkLine(i, j, -1, 1, symbol)) {
                    return true;
                }
            }
        }
        return false;
    }

}

