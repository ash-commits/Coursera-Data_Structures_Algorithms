import java.util.*;
import java.util.ArrayList;

public class BinarySearch{
    private static ArrayList BinarySearch(ArrayList a,int low,int high,int key,ArrayList results){
        int mid = (low+high)/2;
        int p = (Integer)a.get(mid);
        if (high<low)
            return results;
        if (key == p)
            results.add(p)
            return BinarySearch(a, low, mid-1, key,results);
        else if (key<p) 
            return BinarySearch(a, low, mid-1, key,results);
        else
            return BinarySearch(a, mid+1, high, key,results);
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
            results = BinarySearch(arr,0,arr.size()-1,karr.get(i),results);
            
        }
        for(i=0;i<k;i++)
        System.out.printf("%d ",results.get(i));
    }
}