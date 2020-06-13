import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class MaxSlidingWindow {
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize){
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> list = new LinkedList<>();
        if(arr.length>0){
            if(arr.length<windowSize){
                return result;
            }
            for(int i = 0; i< windowSize; i++){
                if(!list.isEmpty()&& arr[i]>arr[list.peekLast()]){
                    list.removeLast();
                }
                list.addLast(i);
            }
            for(int i = windowSize; i< arr.length; i++){
                result.add(arr[list.peek()]);
                while(!list.isEmpty()&&list.peek()<= i-windowSize){
                    list.removeFirst();
                }
                while(!list.isEmpty()&&arr[i]>arr[list.peekLast()]){
                    list.removeLast();
                }
                list.addLast(i);

            }
            result.add(arr[list.peek()]);
        }

        return result;
    }
    public static void main(String[] args) {
    
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Max = " + findMaxSlidingWindow(array, 3));
        
        int[] array2 = {10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67};
        System.out.println("Array = " + Arrays.toString(array2));
        System.out.println("Max = " + findMaxSlidingWindow(array2, 3));
      }
}