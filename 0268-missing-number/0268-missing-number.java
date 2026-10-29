class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfN = (n * (n + 1)) / 2;
        int calSum = 0;
        for(int num: nums){
            calSum += num;
        }
        int result = sumOfN - calSum;
        return result;
    }
}