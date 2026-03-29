class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        
        int left=0;
        int right=0;
        int maxLen=0;

        HashSet<Character>set=new HashSet<>();
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            int len=right-left+1;
            maxLen=Math.max(len,maxLen);
            right++;
        }
        return maxLen;
    }
}
