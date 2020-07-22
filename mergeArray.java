import java.util.ArrayList;

class Pair {
    public int first;
    public int second;

    public Pair(int x, int y){
        this.first = x;
        this.second = y;
    }

}
public class mergeArray {
    public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v){
        ArrayList<Pair> ans = new ArrayList<>();
        if(v==null || v.size()==0) return null;
        for (int i = 0; i < v.size(); i++) {
            Pair tmp = v.get(i);
            if(i==0){
                ans.add(new Pair(tmp.first,tmp.second));
            }
            else{
                Pair a = ans.get(ans.size()-1);
                if(tmp.first>a.second){
                    ans.add(new Pair(tmp.first,tmp.second));
                    continue;
                }
                else {
                    ans.get(ans.size()-1).second = Math.max(tmp.second, a.second);
                }       //implement Math.max 
            }
            
        }

        return ans;

    }
    public static void main(String[] args) {
        ArrayList<Pair> v = new ArrayList<Pair>();
    
        v.add(new Pair(1, 5));
        v.add(new Pair(3, 7));
        v.add(new Pair(4, 6));
        v.add(new Pair(6, 8));
        v.add(new Pair(10, 12));
        v.add(new Pair(11, 15));
    
        ArrayList<Pair> result = mergeIntervals(v);
    
        for(int i=0; i<result.size(); i++){
          System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
        }
      }
}