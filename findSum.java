import java.util.Arrays;

public class findSum {
    public static boolean findSumofTwo(int[] A, int val) {
        /** using hashing
         * given unordered array 
         **/
        Arrays.sort(A);
        Arrays.sort(A);
        int start = 0;
        int end = A.length-1;
        while(start<=end){
            int sum = A[start]+A[end];
            if(sum==val) return true;
            if(sum>val){
                end -= 1;
            }
            else{
                start +=1;
            }
        }
        return false;
    }
}