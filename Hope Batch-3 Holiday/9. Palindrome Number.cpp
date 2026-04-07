class Solution {
public:
    bool isPalindrome(int x) {
        long temp=x;
        long pal=0;
        while (temp!=0 && temp>0){
            pal=(pal*10)+(temp%10);
            temp/=10;
        }
        return (pal==x);
    }
};