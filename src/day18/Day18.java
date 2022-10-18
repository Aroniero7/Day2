package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Day18 {
    public static void main(String[] args) throws IOException {
        System.out.println(reverseNumber(-5544));
    }

    private static void removeAndAddString() throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        System.out.println(strings);
        String str;

        for (int i = 0; i < 5; i++) {
            str = strings.get(4);
            strings.remove(4);
            strings.add(0, str);
        }
        System.out.println(strings);
    }

    private static void removeAndTurnString() throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        System.out.println(strings);

        strings.remove(2);

        Collections.reverse(strings);

        System.out.println(strings);
    }

    private static void doubleString() throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        System.out.println(strings);
        doubleValue(strings);
//        String prev;
//        for (int i = 0; i < strings.size(); i++) {
//            prev = strings.get(i);
//            System.out.println(prev + " " + strings.get(i));
    }

    private static void doubleValue(List<String> strings) {
        String prev;
        for (int i = 0; i < strings.size(); i++) {
            prev = strings.get(i);
            System.out.println(prev + " " + strings.get(i));
        }
    }

    private static void turnInteger() throws IOException {
        List<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(integers);

        for (int i = 4; i >= 0; i--) {
            System.out.println(integers.get(i));
        }
    }

    private static void endString() throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            if (reader.readLine().equals("end")) {
                break;
            } else {
                strings.add(reader.readLine());
            }
        }
        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    private static void date() {
        Date today = new Date();
        int hours = today.getHours();
        int mins = today.getMinutes();
        int secs = today.getSeconds();
        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }

    private static void yearsDate() {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfYear();
        System.out.println(day);
    }

    private static int reverseNumber(int number) throws IOException {

        int reversedNumber = 0;
        int numberToReverse = Math.abs(number);
        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + mod;
            numberToReverse /= 10;
        }
        return number < 0 ? reversedNumber * -1 : reversedNumber;
    }

}

