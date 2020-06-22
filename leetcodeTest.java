import java.util.HashMap;

class Solution {
    public static String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] ans = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            if(!map.containsKey(names[i])){
                ans[i]=names[i];
            }
            else{
                int k = map.get(names[i])+1;
                while(map.containsKey(names[i]+"("+k+")")){
                    k++;
                }
                map.put(names[i], k);
                ans[i]= names[i]+"("+k+")";
            }
            map.put(ans[i],0);
        }
        return ans;
    }
    
    public static void main(String []args) {
        String[] names = {"wano","wano","wano","wano"};
        getFolderNames(names);
        
        
    }
}