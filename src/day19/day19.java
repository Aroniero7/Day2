package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class day19 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(reader.readLine());
//        getIntegerList(N);

        ArrayList<Human> children1 = new ArrayList<Human>();
        Human Child1 = new Human("child1", true, 5, new ArrayList<Human>());
        Human Child2 = new Human("child2", true, 5, new ArrayList<Human>());
        Human Child3 = new Human("child3", true, 5, new ArrayList<Human>());

        children1.add(Child1);
        children1.add(Child2);
        children1.add(Child3);


        Human Father = new Human("father", true, 56, children1);
        Human Mother = new Human("mother", false, 56, children1);

        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(Father);
        ArrayList<Human> children3 = new ArrayList<Human>();
        children3.add(Mother);

        Human gMom1 = new Human("gmom1", false, 56, children2);
        Human gDad1 = new Human("gmom1", false, 56, children2);

        Human gMom2 = new Human("gmom2", false, 56, children3);
        Human gDad2 = new Human("gmom2", false, 56, children3);

        System.out.println(gDad1);
        System.out.println(gDad2);
        System.out.println(gMom1);
        System.out.println(gMom2);

        System.out.println(Father);
        System.out.println(Mother);

        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
    }

    private static void getIntegerList(int N) throws IOException {
        List<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vveite chisla");
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(reader.readLine());
            integers.add(number);
        }
        System.out.println(integers);

        getMinimum(integers);
    }

    private static void getMinimum(List<Integer> integers) {
        int min = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
        }
        System.out.println("min " + min);
    }



    }

