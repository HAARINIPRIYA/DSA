class Solution {
    public int trap(int[] height) {
       int n=height.length;
        int[] r=new int[n];
        int[] l=new int[n];
        l[0]=height[0];
        r[n-1]=height[n-1];
        int sum=0;
        for(int i=1;i<n;i++){
            if(l[i-1]<height[i]){
                l[i]=height[i];
            }
            else{
                l[i]=l[i-1];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(r[i+1]<height[i]){
                r[i]=height[i];
            }
            else{
                r[i]=r[i+1];
            }
        }
        for(int i=0;i<n;i++){
        sum+= (Math.min(l[i],r[i])-height[i]);
        }
        return sum; 
    }
}