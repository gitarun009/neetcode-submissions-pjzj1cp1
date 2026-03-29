/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals == null || intervals.size() == 0) return 0;

        // Sort by start time
        Collections.sort(intervals, (a,b) -> a.start - b.start);

        // Min heap -> stores end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // First meeting
        pq.offer(intervals.get(0).end);

        for(int i = 1; i < intervals.size(); i++){

            // If room becomes free
            if(intervals.get(i).start >= pq.peek()){
                pq.poll(); // reuse room
            }

            // allocate room
            pq.offer(intervals.get(i).end);
        }

        return pq.size();
    }
}
