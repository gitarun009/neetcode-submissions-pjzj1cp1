class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        if (position.length==1) return 1;
        int n=position.length;
        int [][]cars= new int[n][2];

        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        int count=1;
        double d=target-cars[0][0];
        double t = (double) d / cars[0][1];

        for(int i=1;i<n;i++){
            d= target-cars[i][0];
            double currT = (double) d / cars[i][1];
            if(currT > t){ 
                count++;
                t=currT;
            }
        }
        return count;
    }
}
