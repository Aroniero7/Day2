package day8;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        System.out.println(sumOf());
        System.out.println(sumOf(12, 12, 2, 38));
        System.out.println(sumOf(5, 15, 18, 1));
    }

    private static int sumOf(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
