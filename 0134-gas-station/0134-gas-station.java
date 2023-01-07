class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        //TookHelpFromChatGPT ..\U0001f616\U0001f614
        
        int n = gas.length;
        for (int i = n - 1; i >= 0; i--) {
            int remaining = 0;
            int j = i;
            do {
                remaining += gas[j] - cost[j];
                if (remaining < 0) {
                    break;
                }
                j = (j + 1) % n;
            } while (j != i);
            if (remaining >= 0) {
                return i;
            }
        }
        return -1;
    }
}

// MY Code Which passes 34/37 testcases but .. aage Vahi TIME LIMIT EXCEEED \U0001f642\U0001f642\U0001f642

// class Solution {

//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         for(int i=0; i<gas.length; i++){
            
//             int tgas = gas[i], j=i+1;
            
//             if(j > gas.length-1)
//                 j = 0;
            
//             if( (gas[i] >= cost[i]) && check(gas,cost,i,j,tgas) ){
//                 return i;
//             }
//         }
//         return -1;
//     }
    
//     public boolean check(int[] gas,int[] cost, int i, int j, int tgas){
//         int temp = 0;
//         while(tgas >= cost[i]){
            
//             tgas += gas[j] - cost[i];
//             temp++;

//             if(j == gas.length-1)
//                 j = 0;
//             else
//                 j++;

//             if ( i == gas.length-1)
//                 i = 0;
//             else
//                 i++;

//             if(temp == gas.length)
//                 return true;
//         }
//         return false;
//     }
// }