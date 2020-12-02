class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet();
        Set<Integer> dups = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length-2; i++){
            if (dups.add(nums[i])){
                for (int j = i+1; j < nums.length; j++){
                    int complement = -nums[i]-nums[j];
                    if (map.containsKey(complement) && map.get(complement)!=i && map.get(complement)!=j){
                        List<Integer> l = new LinkedList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(complement);
                        Collections.sort(l);
                        ans.add(l);
                    }
                    map.put(nums[j], j);
                }
            }
        }
        return new ArrayList(ans);
    }
}