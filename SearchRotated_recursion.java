public class SearchRotated_recursion {
    static int binarySearchRecursion(int[] arr, int key,int start, int end){

        int mid = start + ((end-start)/2);
        if(arr[mid]== key){
            return mid;
        }
        if(start>end){
            return -1;
        }
        if(arr[mid]>=arr[start] && key>=arr[start] && key<=arr[mid]){
            return binarySearchRecursion(arr, key, 0, mid-1);

        }
        else if(arr[mid]>=arr[end]){
            return binarySearchRecursion(arr, key, mid+1, end);

        }
        else if(arr[mid]<=arr[end] && key>=arr[mid] && key<=arr[end]){
            return binarySearchRecursion(arr, key, mid+1, end);

        }
        else if(arr[start]>= arr[mid]){
            return binarySearchRecursion(arr, key, start, mid-1);
        }
        return -1;
    }
        static int binarySearchRotated(int[] arr, int key){
        
            return binarySearchRecursion(arr, key, 0, arr.length-1);
        }
        public static void main(String []args) {
            int[] array = {4,5,6,1,2,3};
            System.out.println(binarySearchRotated(array, 3)); 
        }

    
}