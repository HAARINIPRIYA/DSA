class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
        int m=nums2.length;
        int l=m+n;
        int mid=l/2;
        double med;
        int[] arr=new int[l];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            arr[n+j]=nums2[j];
        }
        Arrays.sort(arr);
        if(l%2==0){
            med=((arr[mid-1])+(arr[mid]))/2.0;
        }    
        else{
            med=arr[mid];
        }
        return med;
    }
}