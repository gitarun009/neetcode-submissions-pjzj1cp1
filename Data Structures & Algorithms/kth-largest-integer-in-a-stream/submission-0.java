class KthLargest {
    public PriorityQueue<Integer>pq= new PriorityQueue<>();
    public int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        pq.add(val);

        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
