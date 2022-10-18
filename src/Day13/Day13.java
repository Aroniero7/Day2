package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day13 {
    public static void main(String[] args) throws IOException {
getSizeNumber(23,23);

    }

    private static void inputNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(str);
        System.out.println("Я зарабатываю $" + n + " в час");

    }

    private static void inputNameNumber1Number2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("VVedite name");
        String name = reader.readLine();
        System.out.println("Num1");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Num2");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " budet poluchat' " + number1 + " cherez " + number2 + " let");
    }

    private static void getSizeNumber(int a, int b) {
        int x = 5;
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println(a);
        } else if (Math.abs(x - b) < Math.abs(x - a)) {
            System.out.println(b);
        } else {
            System.out.println(a + " " + b);
        }
    }
}
