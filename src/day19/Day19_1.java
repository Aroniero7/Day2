package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Day19_1 {
    public static void main(String[] args) throws IOException {
        // arrayMax5();
        StringAll();
    }

    private static void arrayMax5() throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(reader.readLine());
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        int[] max = new int[5];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (count == 5) {
                break;
            }
            if (array[i] > num) {
                num = array[i];
                max[i] = num;
                count++;
            }
        }
        System.out.println(Arrays.toString(max));
    }

    private static void StringAll() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            alphabet.add((char) ('a' + i));
        }
      // alphabet.add(6, 'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //Напишите тут ваш код

        int count = 0;
        //суперциклы. И че я так долго думал над этим?
        //сначала по алфавиту, потом по строке, потом по символу строки.
        for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if (abs == symbol)
                        count++;
                }
            }
            System.out.println(abs + " " + count);
            count = 0;
        }
    }
}
