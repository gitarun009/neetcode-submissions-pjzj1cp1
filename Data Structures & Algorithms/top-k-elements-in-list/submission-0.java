class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap= new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
            if(minHeap.size()==k){
                if(map.get(num)>map.get(minHeap.peek())){
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
            else minHeap.offer(num);
        }

        int []res=new int [k];
        for(int i=0;i<k;i++){
            res[i]=minHeap.poll();
        }

        return res;
    }
}