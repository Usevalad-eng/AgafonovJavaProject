import algorithms.Array;
import algorithms.Hello;
import algorithms.John;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("-------------------");

        Hello hello = new Hello(8);
        hello.getHello();

        Scanner in = new Scanner(System.in);  //with the scanner
        System.out.print("Input a number and press the enter: ");
        int num = in.nextInt();
        hello.getHelloWithScanner(num);

        System.out.println("-------------------");

        John john = new John("John");
        john.getJohn();

        System.out.println("----------------");

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Array array1 = new Array(array);
        array1.getArray();

        System.out.println("----------------");
    }
}
