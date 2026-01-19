class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int j=0;j<stones.length();j++){
            for(int i=0;i<jewels.length();i++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}