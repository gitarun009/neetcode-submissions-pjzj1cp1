class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(hand);


        for(int n:hand){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int num:hand){
            if(map.get(num)==0) continue;
            for(int i=0;i<groupSize;i++){
                if(map.getOrDefault(num+i,0) == 0)return false;
                map.put(num+i,map.get(num+i)-1);
            }
        }
        return true;
    }
}
