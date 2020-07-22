import java.util.Arrays;

public class moveZeros {
    public static void moveZerosToleft(int[] A) {
        if(A.length<1){
            return;
        }
        int read = A.length-1, write = A.length-1;
        while(read>=0){
            if(A[read]!=0){
                A[write]=A[read];
                write--;
            }
            read--;
        }
        while(write>=0){
            A[write]=0;
            write--;
        }
    }
    public static void main(String[] args) {
        int[] A = {2,5,7,0,8,0,0,9,0,1};
        moveZerosToleft(A);
        System.out.println(Arrays.toString(A));
    }
}