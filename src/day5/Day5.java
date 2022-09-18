package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        split();
    }

    public static void numberChetnost() {
        System.out.println("Vvedite chislo: ");
        int number = new Scanner(System.in).nextInt();
        if (number % 2 == 0) {
            System.out.println("Chislo " + number + " chetnoe");
        } else {
            System.out.println("Chislo " + number + " nechetnoe");
        }
    }

    public static void minNumberModul(int a, int b, int c) {
        if (Math.abs(a) < Math.abs(b) && Math.abs(b) > Math.abs(c)) {
            System.out.println(b);
        } else if (Math.abs(a) > Math.abs(b) && Math.abs(a) > Math.abs(c)) {
            System.out.println(a);
        } else
            System.out.println(c);
    }

    public static void split() {
        String x = "10/abc";
        String[] words = x.split("/");
        System.out.println(words[0]);
    }
}



