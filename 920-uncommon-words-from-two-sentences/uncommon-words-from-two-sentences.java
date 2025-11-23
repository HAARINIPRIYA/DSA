class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       HashSet<String> set=new HashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        for(String i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:arr2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:map.keySet()){
            if(map.get(i)<=1){
                set.add(i);
            }
        }
        String ans[]=new String[set.size()];
        int j=0;
        for(String i:set){
            ans[j++]=i;
        }
        return ans;
    }
}