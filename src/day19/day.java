package day19;

import java.io.File;
import java.util.Scanner;

public class day {
    public static void main(String[] args) {

        System.out.println("D:\\Games");
        String sc = new Scanner(System.in).nextLine();
        File folder = new File(sc);
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.length());
        }
        System.out.println("Size games");

    }
}

