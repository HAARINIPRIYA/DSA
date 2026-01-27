class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uniquecount=1;
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
                    uniquecount++;
            }
        }
        return Math.min(uniquecount,candyType.length/2);
    }
}