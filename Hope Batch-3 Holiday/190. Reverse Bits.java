class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++){
            int last_digit = n & 1;
            
            res = res << 1;
            res = res | last_digit;

            n = n >> 1;
        }
        return res;
    }
}