class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        backtrack(0, res,nums,new ArrayList<>());
        return res;
    }

    public void backtrack(int start,  List<List<Integer>> res, int[]nums, List<Integer> curr){
        res.add(new ArrayList<>(curr));
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])continue;
             
            curr.add(nums[i]);
            backtrack(i+1, res,nums, curr);
            curr.remove(curr.size()-1);
        }
    }
}
