class Solution {
    public int lastStoneWeight(int[] stones) {

        if(stones.length==1) return stones[0];
        if(stones.length==0)return 0;

        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()!=1){
            int big=pq.poll();
            int small=pq.poll();
            if(big==small)pq.add(0);
            else pq.add(big-small);
        }
        
        return pq.peek();
    }
}
