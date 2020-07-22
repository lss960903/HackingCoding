class Tuple<X,Y>{
    public X x;
    public Y y;
    public Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }
}



public class stockPrices {
    public static Tuple findBuySellStockPrices(int[] array) {
        int buy = array[0], sell = array[1];
        int profit = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            int tmp_profit = array[i]-buy;
            if(tmp_profit>profit){
                profit = tmp_profit;
                sell = array[i];
            }
            if(array[i]<buy){
                buy = array[i];
            }
        }
        Tuple<Integer, Integer> result = new Tuple<Integer,Integer>(sell-profit,sell);

        return result;

    }
    public static void main(String[] args) {
        int[] A = {21,12,11,9,6,3};
        Tuple result = null;
        result = findBuySellStockPrices(A);
        System.out.println(result.x+" "+ result.y);
        int[] B = {8,5,12,9,19,1};
        Tuple result1 = null;
        result1 = findBuySellStockPrices(B);
        System.out.println(result1.x+" "+ result1.y);

    }
}
