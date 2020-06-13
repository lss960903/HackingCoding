public class binarySearch {
static int binSearch(int[] a, int key) {
    int low = 0;
    int high = a.length-1;
    while(low<=high){
        int mid = low + ((high-low)/2);
        if(a[mid]==key){
            return mid;
        }
        if(a[mid]<key){
            low = mid+1;
        }
        else high = mid-1;
    }
    return -1;
        }

public static void main(String []args){
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int[] inputs = {10, 49, 99, 110, 176};

        for (int i = 0; i < inputs.length; i++) {
        System.out.println("binSearch(arr, " + inputs[i]+ ") = " +  binSearch(arr, inputs[i]));
        }
    }
}