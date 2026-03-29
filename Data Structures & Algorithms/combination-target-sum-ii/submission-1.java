class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int index, int[] candidates, int target,List<Integer> curr, List<List<Integer>> res){

        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = index; i < candidates.length; i++){

            if(i > index && candidates[i] == candidates[i-1])
                continue;

            if(candidates[i] > target)
                break;

            curr.add(candidates[i]);

            backtrack(i + 1, candidates, target - candidates[i], curr, res);

            curr.remove(curr.size() - 1);
        }
    }
}