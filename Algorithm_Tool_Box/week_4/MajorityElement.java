import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private static final Scanner scan = new Scanner(System.in);

    private static boolean MajorityElementPresent(int[] arr) {
        Map<Integer, Integer> frequencies = getFrequency(arr);
        for (int frequency : frequencies.values()) {
            if (frequency > arr.length / 2)
                return true;
        }
        return false;
    }

    private static Map<Integer, Integer> getFrequency(int[] arr) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int element : arr)
            frequencies.put(element, frequencies.getOrDefault(element, 0) + 1);
        return frequencies;
    }

    public static void main(String args[]) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println(MajorityElementPresent(arr) ? 1 : 0);

    }
}