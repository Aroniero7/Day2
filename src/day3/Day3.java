package day3;

import java.util.ArrayList;
import java.util.List;


public class Day3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<User> users = new ArrayList<>();
        users.add(new User(29, "Pol"));
        users.add(new User(14, "Andrei"));
        users.add(new User(55, "Stas"));
        users.add(new User(23, "Vasya"));
        String x = "sss";
        strings.add("asd");

        integers.add(5);
        integers.add(25);
        integers.add(-644);
        System.out.println(faintMinimemString(strings));
        System.out.println(maxValue(integers));
        System.out.println(minValue(users));
    }

    private static String faintMinimemString(List<String> strings) {
        if (!strings.isEmpty()) {
            String min = strings.get(0);
            for (String string : strings) {
                if (min.length() > string.length()) {
                    min = string;
                }
            }
            return min;
        }
        return "Коллекция пустая";
    }

    private static Integer maxValue(List<Integer> integers) {
        int x = integers.get(0);
        for (Integer integer : integers) {
            if (x < integer) {
                x = integer;
            }
        }
        return x % 5;
    }

    private static User minValue(List<User> users) {
        User userx = users.get(0);
        for (User user : users) {
            if (user.getName().contains("A") && userx.getAge() > user.getAge()) {
                userx = user;
            }
        }
        return userx;
    }
}