class Solution {
    public int findMinArrowShots(int[][] points) {
        // Sort 2D Array Based on Second Index .. Using Comparator (LAMBDA fn.)
        Arrays.sort(points, (a, b) -> Long.compare(a[1],b[1]));
        int res = 1, j = points[0][1];
        for(int i = 1; i < points.length ; i++){
            if(points[i-1][1] < points[i][0] || j < points[i][0]){
                res += 1;
                j = points[i][1];
                
            }  
        }
        return res;
    }
}