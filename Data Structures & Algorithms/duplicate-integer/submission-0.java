class Solution {

    Map<Integer, Boolean> inArray = new HashMap();

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (inArray.get(nums[i]) != null) {
                return true;
            }
            inArray.put(nums[i], Boolean.TRUE);
        }
        return false;
    }
}