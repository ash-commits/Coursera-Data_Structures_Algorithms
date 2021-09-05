import java.util.*;

public class LargestNumber {
    private static boolean isGreaterOrEqual(String i, String j) {
        if ((i + j).compareTo(j + i) > 0)
            return true;
        return false;
    }

    private static String largestNumber(ArrayList<Integer> a) {
        // write your code here
        String res = "";
        while (a.size() != 0) {
            int max_digit = -1;
            for (Integer i : a) {
                if (isGreaterOrEqual(String.valueOf(i), String.valueOf(max_digit))) {
                    max_digit = i;
                }
            }
            res = res + String.valueOf(max_digit);
            a.remove(new Integer (max_digit));

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        System.out.println(largestNumber(a));
    }
}
