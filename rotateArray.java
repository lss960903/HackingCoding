import java.util.ArrayList;
import java.util.List;

public class rotateArray {
    public static void rotate(List<Integer> arr, int n) { 
        int len = arr.size();
    // Let's normalize rotations
    // if n > array size or n is negative.
    n = n % len;
    if (n < 0) {
      n = n + len;
    }

    rotate(arr, 0, len-1);
    rotate(arr, 0, n-1);
    rotate(arr, n, len-1);
    }

        public static void rotate(List<Integer> arr, int start, int end){
            while(start<end){
              int tmp = arr.get(start);
              arr.set(start,arr.get(end));
              arr.set(end,tmp);
              start++;
              end--;
            }}
    public static void main(String []args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(10);
        arr.add(20);
        arr.add(0);
        arr.add(59);
        arr.add(86);
        arr.add(32);
        arr.add(11);
        arr.add(9);
        arr.add(40);
        System.out.println("Array Before Rotation\n"+arr);
        rotate(arr, -2);
        System.out.println("Array Before Rotation\n"+arr);
    }
    
}