import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int numRefills = 0, currentRefill = 0, lastRefill;
        int n = stops.length;
        int[] stop = new int[n + 2];
        stop[0] = 0;
        for (int i = 1; i <= n; i++) {
            stop[i] = stops[i - 1];
        }
        stop[n + 1] = dist;
        while (currentRefill <= n) {
            lastRefill = currentRefill;
            while (currentRefill <= n && (stop[currentRefill + 1] - stop[lastRefill]) <= tank) {
                currentRefill++;
            }
            if (currentRefill == lastRefill)
                return -1;
            if (currentRefill <= n) {
                numRefills++;
            }
        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
