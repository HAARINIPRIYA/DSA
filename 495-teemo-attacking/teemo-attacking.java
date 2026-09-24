class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int tot=0;
        for(int i=1;i<timeSeries.length;i++){
            int diff= timeSeries[i]-timeSeries[i-1];
            if(diff>=duration){
                tot+=duration;
            }
            else{
                tot+=diff;
            }
        }
        tot+=duration;
        return tot;
    }
}