class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()
        var coin = coins
        var res = 0;
        for(i in costs){
            if( i > coin){
                return res;
            }
            res += 1;
            coin -= i;
        }
        return res;
    }
}