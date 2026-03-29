class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals == null || intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int[] interval = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= interval[1]) {
                interval[1] = Math.max(interval[1], intervals[i][1]);
            } 
            else {
                res.add(interval);
                interval = intervals[i];
            }
        }
        res.add(interval);

        return res.toArray(new int[res.size()][]);
    }
}