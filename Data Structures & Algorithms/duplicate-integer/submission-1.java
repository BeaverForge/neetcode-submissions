class Solution {

    Map<Integer, Boolean> inArray = new HashMap();

    public boolean hasDuplicate(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (inArray.get(nums[i]) != null) {
                return true;
            }
            inArray.put(nums[i], Boolean.TRUE);
        }
        return false;
    }
}