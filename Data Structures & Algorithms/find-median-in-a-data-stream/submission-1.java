class MedianFinder {

    // Max Heap (smaller half)
    PriorityQueue<Integer> left; 
    // Min Heap (greater half)
    PriorityQueue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Step 1: add to maxHeap
        left.offer(num);

        // Step 2: move largest of left to right
        right.offer(left.poll());

        // Step 3: balance sizes
        if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {

        if (left.size() > right.size()) {
            return left.peek(); // odd count
        }

        return (left.peek() + right.peek()) / 2.0; // even count
    }
}
