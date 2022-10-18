package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day17 {
    public static void main(String[] args) throws IOException {

        sortInCollection();
    }

    private static void listNumber() throws IOException {
        List<Integer> number = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number.add(Integer.parseInt(reader.readLine()));
        number.add(Integer.parseInt(reader.readLine()));
        number.add(Integer.parseInt(reader.readLine()));
        number.add(Integer.parseInt(reader.readLine()));
        number.add(Integer.parseInt(reader.readLine()));
        System.out.println(number);
    }

    private static void listString() throws IOException {
        List<String> number = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number.add(reader.readLine());
        number.add(reader.readLine());
        number.add(reader.readLine());
        number.add(reader.readLine());
        number.add(reader.readLine());
        System.out.println(number.size());
        for (String s : number) {
            System.out.println(s);
        }
    }

    private static void numberWhile() throws IOException {
        List<Integer> number = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean x = true;
        int y = Integer.parseInt(reader.readLine());
        while (x) {
            number.add(Integer.parseInt(reader.readLine()));
            if (number.equals(' ')) {
                x = false;
                System.out.println(number);
                break;
            }
        }
    }

    private static void sortInCollection() throws IOException {
        List<Integer> number = new ArrayList<>();
        List<Integer> number1 = new ArrayList<>();
        List<Integer> number2 = new ArrayList<>();
        List<Integer> number3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            number.add(Integer.parseInt(reader.readLine()));
//            System.out.println(number);
            if (number.get(i) % 2 == 0 && number.get(i) % 3 == 0) {
                number2.add(number.get(i));
                number1.add(number.get(i));
            } else if (number.get(i) % 3 == 0) {
                number1.add(number.get(i));

            } else if (number.get(i) % 2 == 0) {
                number2.add(number.get(i));

            } else {
                number3.add(number.get(i));
            }
        }
        printList(number1, number2, number3);
    }


    private static void printList(List<Integer> number1, List<Integer> number2, List<Integer> number3) {
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}