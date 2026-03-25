class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority = nums.length /2;

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            
            while (i < nums.length && nums[i] == num){
                count++;
                i++;
            }
            if (count > majority) return num;
                i--;
        }
        return 0;
    }
}