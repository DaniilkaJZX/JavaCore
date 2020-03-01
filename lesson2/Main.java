package lesson2;

import java.util.Arrays;
import java.util.Random;

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

//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            if( n % i == 0){
//                System.out.print(i + " ");
//            }
//        }

//        int y =256;
//        while (y > 0){
//            System.out.print(y+" ");
//            y /= 2;
//        }

//      Рзложение на простые  множетили
//        int x = 3214;
//        int k = 2;
//        while (x > 1){
//            while(x % k == 0){
//                System.out.print(k + " * ");
//                x /= k;
//            }
//            k++;
//        }

//        int x = 2;
//        do{
//            System.out.println(x);
//            x += 3;
//        }while(x<10);

//        for (int i = 1; i < 10; i++) {
//            if (i % 3 == 0 ){
//                break;
//            }
//            System.out.print(i + " ");
//        }
//       int n = 1;
//        switch (n){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            default:
//                System.out.println("no ");
//        }
//        int [] arr = new int[10];
//        arr[0] = 5;
//        arr[1] = 25;
//        System.out.println(Arrays.toString(arr));

//        int[] arr2 = {1, 2, 3};
//        System.out.println(Arrays.toString(arr2));

//        String[] strArr = {"ads", "asdas"};
//        System.out.println(Arrays.toString(strArr));
        
//        int [] arr = new int[10];
//        Random rand = new Random();
//        for (int i = 0; i < arr.length ; i++) {
////            arr[i] = i;
//            arr[i] = rand.nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] % 2 != 0){
//                arr[i] += 1000;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        String [] strArr = new String[5];
//        strArr[1] = "qwe";
//        strArr[3] = "zxc";
//        System.out.println(Arrays.toString(strArr));
        String[][] arr2d = {
                {"weq","Sds","weraw"},
                {"weqr","Sdsr","werawr"},
                {"weqt","Sdst","werawt"}
        };
        printArr2D(arr2d);
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
    static void printArr2D(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }


}
