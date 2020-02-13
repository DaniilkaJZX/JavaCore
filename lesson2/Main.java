package lesson2;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        printWords(7,"Java");
//        for (byte i = 100; i != 0; i++) {
//            System.out.print(i + " ");
//    }
//        printMultyTable(10);

        int n = 5;
        for (int i = 1; i <= n ; i++) {
            if( n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void printWords(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    static void printMultyTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("\t%d", i * j);
            }
            System.out.println();
        }
    }



}
