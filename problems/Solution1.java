class Solution {
    public boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k < nums.length; k++){
                    if (nums[i] < nums[j] && nums[j] < nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // O(n) solution
    public boolean increasingTriplet2(int[] nums) {
        if (nums.length > 2){
            int first = nums[0];
            int min = Integer.MIN_VALUE;
            int second = min;
            int third = min;
            for (int i = 0; i < nums.length; i++){
                int curr = nums[i];
                if(curr < first){
                    first = curr;
                } else if (curr > first){
                    if (second == min){
                        second = curr;
                    } else if (second >= min && curr > second && third == min){
                        return true;
                    } else if (curr < second){
                        second = curr;
                    }
                }
            }
        }
        return false;
    }
}