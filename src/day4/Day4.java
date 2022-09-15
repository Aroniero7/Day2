package day4;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        addColection(integers);
        System.out.println(integers.size());
        for (int integer : integers) {
            System.out.println(integer);
        }
        System.out.println("Max Value: " + maxValue(integers));
        System.out.println("Min Value: " + minValue(integers));
        System.out.println("AVG: " + avgValue(integers));

    }

    public static void addColection(List<Integer> integers) {
        for (int i = 0; i <= 100; i++) {
            int x = (int) Math.random() * (100 - i) + i * 2;
            integers.add(x);
        }
    }

    public static Integer maxValue(List<Integer> integers) {
        Integer x = integers.get(0);
        for (Integer integer : integers) {
            if (x < integer) {
                x = integer;
            }
        }
        return x;
    }

    public static Integer minValue(List<Integer> integers) {
        Integer x = integers.get(0);
        for (Integer integer : integers) {
            if (x > integer) {
                x = integer;
            }
        }
        return x;
    }

    public static Integer avgValue(List<Integer> integers) {
        Integer x = 0;
        for (Integer integer : integers) {
            x = x + integer;
        }
        return x / integers.size();
    }
}