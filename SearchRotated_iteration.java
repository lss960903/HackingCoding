public class SearchRotated_iteration {
    static int  binarySearch(int[] arr, int key, int start, int end) {
        if(start>end){
            return -1;
        }
        while(start<=end){
            int mid = start + ((end-start)/2);

            if(arr[mid]==key){
                return mid;
        }
            else if(arr[start]<=arr[mid] && key>=arr[start] && key<=arr[mid]){
                end = mid-1;

            }
            else if(arr[mid]>=arr[end]){
                start  =mid+1;

            }
            else if(arr[mid]<=arr[end] && key>=arr[mid] && key<=arr[end]){
                start = mid+1;

            }
            else if(arr[start]>=arr[mid]){
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String []args) {
        int[] array = {4,5,6,1,2,3};
        System.out.println(binarySearch(array,3,0,array.length-1));
    }
}