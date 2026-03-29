class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        if(n==1)return new int[]{0};

        int[]res=new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(0);

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int idx=st.pop();
                res[idx]=i-idx;
            }
            
            st.push(i);
        }
        res[n-1]=0;
        return res;
    }
}
