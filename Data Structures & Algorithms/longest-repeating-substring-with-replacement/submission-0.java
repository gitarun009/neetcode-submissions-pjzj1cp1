class Solution {
    public int characterReplacement(String s, int k) {
        int[] alpha=new int[26];

        int left=0;
        int right=0;
        int maxf=0;
        int res=0;

        while(right<s.length()){
            alpha[s.charAt(right)-'A']++;
            maxf=Math.max(maxf,alpha[s.charAt(right)-'A']);

            if((right-left+1)-maxf >k){
                alpha[s.charAt(left)-'A']--;
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
