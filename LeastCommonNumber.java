/**
 * findLeastCommonNumber
 */
public class LeastCommonNumber {

    static Integer findLeastCommonNumber(int[] arr, int[] arr2, int[] arr3) {
        int[] p = {0,0,0};
            while(p[0]<arr.length && p[1]<arr2.length && p[2]<arr3.length){
                int minIndex = 0;
                if(isEqual(arr[p[0]],arr2[p[1]],arr3[p[2]])){
                    return arr[p[0]];
                }
                minIndex = findMinIndex(arr[p[0]],arr2[p[1]],arr3[p[2]]);
                p[minIndex]++;
    
            }
    
            return -1;
        }
        public static boolean isEqual(int a,int b, int c) {
            if(a==b){
                if(a==c){
                    return true;
                }
            }
            return false;
        }
        public static int findMinIndex(int a, int b, int c) {
            int min = 0;
            int value = a;
            if(a>b){
                min = 1;
                value = b;
            }
            else if(value>c){
                min = 2;
            }
            
            return min;
        }
    public static void main(String []args){
        int[] v1 = new int[]{6, 7, 10, 25, 30, 63, 64};
        int[] v2 = new int[]{1, 4, 5, 6, 7, 8, 50};
        int[] v3 = new int[]{1, 6, 10, 14};
    
        Integer result = findLeastCommonNumber(v1, v2, v3);
        System.out.println("Least Common Number: " + result);
      }
}