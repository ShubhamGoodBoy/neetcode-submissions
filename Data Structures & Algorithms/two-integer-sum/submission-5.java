class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i]; // Store the value
            A[i][1] = i;       // Store the original index
        }

        // 2. Sort the 2D array based on the values (column 0)
        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        // 3. Two-pointer traversal
        int i = 0;
        int j = nums.length - 1;
        
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            
            if (cur == target) {
                // Return the indices with the smaller index first
                return new int[]{Math.min(A[i][1], A[j][1]), 
                                 Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++; // Sum is too small, move left pointer right
            } else {
                j--; // Sum is too large, move right pointer left
            }
        }
        
        return new int[0];
    }
}
