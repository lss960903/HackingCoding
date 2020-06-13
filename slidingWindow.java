import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindow {

    public static ArrayDeque<Integer> max(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> list = new LinkedList<>();

        if(arr.length>0){
            if(arr.length<windowSize){
                return result;
            }
            for (int i = 0; i < windowSize; i++) {
                while (!list.isEmpty()&&arr[i]>arr[list.getFirst()]) {
                    list.removeFirst();
                }
                list.addLast(i);
            }
            for (int i = windowSize; i < arr.length; i++) {
                result.add(arr[list.getFirst()]);
                while(!list.isEmpty()&&arr[i]>arr[list.peek()]){
                    list.removeLast();
                }
                while(!list.isEmpty() && list.getFirst()<i-windowSize+1){
                    list.removeFirst();
                }
                list.addLast(i);
            }
            result.add(arr[list.getFirst()]);

        }
        else return null;

        return result;
    }

    public static void main(String[] args) {
        int[] array = {7,9,8,6,5,3,2};
        System.out.println(Arrays.toString(array));
        System.out.println(max(array,3));
    }

}