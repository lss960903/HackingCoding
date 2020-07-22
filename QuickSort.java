public class QuickSort {
    public static void quickSort(int[] A) {
        int start = 0;
        int end = A.length-1;
        sort(A, start, end);

    }
    private static void sort(int[] A, int start, int end) {
        if(start<end){
            int index = partition(A, start, end);
            sort(A,start,index-1);
            sort(A, index+1, end);
            }
        
    }
    public static int partition(int[] A, int start, int end) {
        int i = start-1;
        int pivot = A[end];
        for (int j = start; j < end; j++) {
            if(A[j]<=pivot){
                i++;
                swap(i,j,A);
            }
        }
        swap(i+1, end, A);
        return i+1;

    }
    public static void swap(int a, int b, int[] A) {
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }

    public static void main(String[] args) {
        int[] A = {1,6,9,3,6,2,7};
        quickSort(A);
        for(int b:A){
            System.out.println(b);
        }
    }


}