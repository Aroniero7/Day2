package Day14;

public class Day14 {
    public static void main(String[] args) {

        System.out.println(searchNumber(185398));
    }

    private static double convertK(double c) {
        return Math.round(c * 274.15);
    }

    private static double convertF(double c) {
        return Math.round(c * 33.8);
    }

    private static int searchNumber(int n) {
        int i = 1;
        int prev = 0;
        int count = 0;

        while (true) {

            if (i < n) {
                prev = i;
                i = (i * 2);
                count++;
            }
            if (i > n) {
                i = prev + ((i - prev) / 2);
                count++;
            }
            if (i == n) {
                return count;
            }
        }
    }
}
