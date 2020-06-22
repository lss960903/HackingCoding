import java.util.Arrays;
import java.util.List;

/**
 * findLowHigh index of a key in a sorted array use binary search
 */
public class findLowHigh {
    public static int findLowIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size()-1;
        
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr.get(mid)==key&&arr.get(mid-1)<key){
                return mid;
            }
            if(arr.get(mid)<key){
                low = mid+1;

            }
            if(arr.get(mid)>key){
                high = mid-1;
            }
            if(arr.get(mid)==key&& arr.get(mid-1)==key){
                high = mid-1;
            }
        }

        return -2;
    }

    public static int findHighIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size()-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr.get(mid)==key&&arr.get(mid+1)>key){
                return mid;
            }
            if(arr.get(mid)<key){
                low = mid+1;

            }
            if(arr.get(mid)>key){
                high = mid-1;
            }
            if(arr.get(mid)==key&& arr.get(mid+1)==key){
                low = mid+1;
            }
        }
        return -2;
    }
    public static void main(String []args) {
        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4,4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
        System.out.println("low"+findLowIndex(array, 2));
        System.out.println("high"+findHighIndex(array, 2));

    }
}