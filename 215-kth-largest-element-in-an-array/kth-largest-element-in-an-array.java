class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        int arr[] = new int[set.size()];
        int h = 0;
        for(int m : set)
        {
            arr[h++] = m;
        }
        return nums[nums.length-k];
    }
}