class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high, pile);
        }

        int res = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            int hours = 0;

            for(int pile : piles){
                hours += (pile + mid - 1) / mid; // CEIL
            }

            if(hours <= h){
                res = mid;
                high = mid - 1; // try smaller speed
            }
            else{
                low = mid + 1; // need faster speed
            }
        }

        return res;
    }
}