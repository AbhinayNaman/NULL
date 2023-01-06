class Solution {
public:
    int maxIceCream(vector<int>& costs, int coins) {
        std::sort(costs.begin(), costs.end());
        int res = 0;
        for (int i : costs) {
            if (i > coins) {
                return res;
            }
            res += 1;
            coins -= i;
        }
        return res;
    }
};