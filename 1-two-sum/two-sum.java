class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++ ) {
            int missing = target - nums[i];

            if (numbers.containsKey(missing))
                return new int[]{numbers.get(missing), i};

            numbers.put(nums[i], i);
        }
        return new int[]{};
    }
}