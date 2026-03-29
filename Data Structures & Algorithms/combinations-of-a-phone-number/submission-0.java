class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList();
        String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res= new ArrayList<>();
        backtrack(0,map,digits,new StringBuilder(),res);
        return res;
    }

    public void backtrack(int i, String[]map, String digits, StringBuilder curr, ArrayList<String>res){
        if(curr.length()==digits.length()){
            res.add(curr.toString());
            return;
        }

        String letters= map[digits.charAt(i)-'0'];

        for(char c:letters.toCharArray()){
            curr.append(c);
            backtrack(i+1,map,digits,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
