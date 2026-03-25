class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int ind1 = 0, ind2 = 1;
        for (int i = 0,j = n; i < n; i++,j++){
            arr[ind1] = nums[i];
            arr[ind2] = nums[j];
            ind1 = ind1 + 2;
            ind2 = ind2 + 2;
        }
        return arr;
    }
}