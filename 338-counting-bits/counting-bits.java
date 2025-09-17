class Solution {
    public int[] countBits(int n) {
    int result[] = new int[n + 1];
    int sub = 1;
    for (int index=1; index<n+1; index++){
        if (sub*2 == index){
            sub*= 2;
        }
        result[index] = result[index-sub]+1;
    }
    return result;
    }
}