class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int j = Math.abs(nums[i]) - 1;
            if(nums[j] > 0){
                nums[j] = -nums[j];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}