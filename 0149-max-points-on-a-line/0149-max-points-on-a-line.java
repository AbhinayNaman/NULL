class Solution {
    public int maxPoints(int[][] arr) {
        
        // MY CODE is Rigt below .. Saala 4 vaar galat hua be .. \U0001f642\U0001f616 .. Kal Exam hai .. Streak bhi maintain rakhni hai aur raat ke 23:57 ho rhe hain isliye COPYYYY

        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                }
                double slope ;
                if((arr[j][0] - arr[i][0]) != 0) {
                    slope = (arr[j][1] - arr[i][1]) * 1.0 / (arr[j][0] - arr[i][0]);
                }
                else{
                    slope = Integer.MAX_VALUE;
                } 
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max;

        // int n = points.length;
        // int res = 1,slope = 100001;
        // for(int i=0; i<n-1; i++){
        //     Map <Integer,Integer> hash1 = new HashMap<>();
        //     int lres = 1;
        //     for(int j=i+1; j<n; j++){
        //         if(points[j][0]-points[i][0] != 0){
        //             slope = (points[j][1]-points[i][1])/(points[j][0]-points[i][0]);
        //         }
        //         hash1.put(slope,hash1.getOrDefault(slope,0)+1);
        //     }
        //     for(Map.Entry<Integer,Integer> entry : hash1.entrySet()){
        //         System.out.println(entry.getValue());
        //         if(entry.getValue()>lres){
        //             lres = entry.getValue();
        //         }
        //     }
        //     System.out.println(lres);
        //     if(res<lres+1){
        //         res = lres+1;
        //     }
        // }
        // return res;
    }
}