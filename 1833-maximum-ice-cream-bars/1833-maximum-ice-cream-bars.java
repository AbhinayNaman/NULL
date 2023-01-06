class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for(int i : costs){
            if( i > coins){
                return res;
            }
            res += 1;
            coins -= i;
        }
        return res;
    }
}