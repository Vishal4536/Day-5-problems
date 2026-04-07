class Solution {
    public int reverse(int x) {
        long num = x % 10;
        x /= 10;
        
        while (x != 0){
            num = (num * 10) + (x % 10);
            x /= 10;
        }

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0; 

        else return (int)num;
    }
}