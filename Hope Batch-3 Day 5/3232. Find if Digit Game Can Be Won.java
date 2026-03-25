class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doub = 0;
        for (int i : nums){
            if (i < 10) single += i;
            else doub += i;
        }
        return single != doub?true:false;
    }
}