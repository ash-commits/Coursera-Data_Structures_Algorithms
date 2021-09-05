import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        // write your code here
        /*
         * int temp = 0, count = 0; while (m > 0){ if (m >= 10){ count = count + 1 ; m =
         * m - 10; } else if (m >= 5){ count = count + 1; m = m - 5; } else{ count =
         * count + 1 ; m = m - 1; } }
         */
        if (m <= 0)
            return -1;
        else if (m == 10 || m == 5 || m == 1)
            return 1;
        else
            return m / 10 + (m % 10) / 5 + m % 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
