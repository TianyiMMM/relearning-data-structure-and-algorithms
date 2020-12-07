class Solution6 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new LinkedList();
        if (nums.length > 0){
            for (int i = 0; i < nums.length; i++){
                if (i==0){
                    if (nums[i]!=lower){
                        String e = formattedRange(lower, nums[0]-1);
                        res.add(e);
                    }
                }
                if (i==nums.length-1){
                    if (nums[i]!=upper){
                        String e = formattedRange(nums[i]+1, upper);
                        res.add(e);
                    }
                }
                if (i < nums.length-1 && nums[i+1]-nums[i]>1){
                    String e = formattedRange(nums[i]+1, nums[i+1]-1);
                    res.add(e);
                }
            }
        } else {
            String e = formattedRange(lower, upper);
            res.add(e);
        }
        return res;
    }
    
    public String formattedRange(int a, int b){
        if (a == b){
            return Integer.toString(a);
        } else {
            return Integer.toString(a)+"->"+Integer.toString(b);
        }
    }
}