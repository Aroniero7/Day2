package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

public class CatCat {
    public static void main(String[] args) throws IOException {
        List<Cat> cats = new ArrayList<Cat>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            String name = reader.readLine();
            if (name.isEmpty()) break;
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tail);
            cats.add(cat);
            System.out.println(cats);
        }
    }
}