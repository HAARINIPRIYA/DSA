class Solution {
    public int thirdMax(int[] nums) {
    Arrays.sort(nums);
    HashSet<Integer> set = new LinkedHashSet<>();
    for(int n:nums){
        set.add(n);
        }
        List<Integer> list = new ArrayList<>(set);
        if (list.size() >= 3) {
            return list.get(list.size()-3); 
        } else {
            return list.get(list.size()-1);
        }
    }
}