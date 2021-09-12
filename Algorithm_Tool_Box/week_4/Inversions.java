import java.util.Scanner;

public class Inversions {
    private static final Scanner scanner = new Scanner(System.in);

    private static long merge(int[] a, int[] b, int left, int ave, int right) {
        int i = left, j = ave, k = left;
        long count = 0;
        while (i <= ave - 1 && j <= right) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                count += ave - i;
                j++;
            }
            k++;
        }
        while (i <= ave - 1) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= right) {
            b[k] = a[j];
            j++;
            k++;
        }
        for (i = left; i <= right; i++) {
            a[i] = b[i];
        }
        return count;
    }

    private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
        long count = 0;
        if (right <= left) {
            return count;
        }
        int ave = left + (right - left) / 2;
        count += getNumberOfInversions(a, b, left, ave);
        count += getNumberOfInversions(a, b, ave + 1, right);
        count += merge(a, b, left, ave + 1, right);
        return count;
    }

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] a = getArray(length);
        int[] b = new int[length];
        System.out.println(getNumberOfInversions(a, b, 0, a.length - 1));
    }

    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0; index < length; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
}