class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int cost;
        int odd_count = 0;
        int even_count = 0;
        for (int i: position){
            if (i % 2 == 0) even_count++;
            else odd_count++;
        }
        return min(odd_count,even_count);
    }
};
