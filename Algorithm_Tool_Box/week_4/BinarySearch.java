/*import java.util.*;
import java.util.ArrayList;

public class BinarySearch{
    private static int BinarySearch(ArrayList a,int low,int high,int key){
        /*int mid = (low+high)/2;
        int p = (Integer)a.get(mid);
        if (high<low)
            return -1;
        if (key == p)
            return mid;
        else if (key<p) 
            return BinarySearch(a, low, mid-1, key);
        else
            return BinarySearch(a, mid+1, high, key);
            
        while(low <= high){
            int mid = low+(high-low/2);
            if (key == (Integer)a.get(mid))
                return mid;
            else if ( key < (Integer)a.get(mid))
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),i;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(i = 0; i < n; i++){
            arr.add(scan.nextInt());
        }
        int k = scan.nextInt();
        ArrayList<Integer> karr = new ArrayList<Integer>(k);
        for(i = 0; i < k ; i++){
            karr.add(scan.nextInt());
        }
        int res;
        ArrayList<Integer> results = new ArrayList<Integer>(k);
        for(i = 0 ; i < k ; i++){
            res = BinarySearch(arr,0,arr.size()-1,karr.get(i));
            results.add(res);
        }
        for(i=0;i<n;i++)
        System.out.printf("%d ",results.get(i));
    }
}*/
import java.util.*;
import java.util.ArrayList;

public class BinarySearch{
    private static int BinarySearch(int[] a,int low,int high,int key){
        /*int mid = (low+high)/2;
        int p = (Integer)a.get(mid);
        if (high<low)
            return -1;
        if (key == p)
            return mid;
        else if (key<p) 
            return BinarySearch(a, low, mid-1, key);
        else
            return BinarySearch(a, mid+1, high, key);
            */
        while(low <= high){
            int mid = (low+(high-low)/2);
            if (key == a[mid])
                return mid;
            else if ( key < a[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),i;
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int[] karr = new int[k];
        for(i = 0; i < k ; i++){
            karr[i] = scan.nextInt();
        }
        int res;
        int[] results = new int[k];
        for(i = 0 ; i < k ; i++){
            res = BinarySearch(arr,0,n-1,karr[i]);
            results[i] = res;
        }
        for(i=0;i<k;i++)
        System.out.printf("%d ",results[i]);
    }
}