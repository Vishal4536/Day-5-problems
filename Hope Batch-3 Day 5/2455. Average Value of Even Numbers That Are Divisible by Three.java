class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i: nums){
            if (i % 6 == 0){
                sum += i;
                count++;
            } 
        }
        if (count > 0) return sum/count;
        return 0;
        
    }
}
