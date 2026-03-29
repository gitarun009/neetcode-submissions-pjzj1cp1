class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);

            int sum = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
} 