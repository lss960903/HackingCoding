import java.util.LinkedList;
import java.util.List;

class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        //corner case
        if(nums==null || nums.length==0)return null;
        List<List<Integer>> ans = new LinkedList<>();
        helper(0,nums,ans, new LinkedList<Integer>());
        return ans;
    }
    public static void helper(int start,int[] nums,List<List<Integer>> ans,List<Integer> curr){
        ans.add(new LinkedList<Integer>(curr));
        for(int i = start; i< nums.length; i++){
            curr.add(nums[i]);
            helper(i+1, nums, ans, curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        subsets(nums);
    }
}