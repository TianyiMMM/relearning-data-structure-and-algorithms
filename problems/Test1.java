public class Test1{

	public static boolean increasingTriplet2(int[] nums) {
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

	public static void main(String[] arg){
		int[] arr = {1,2,-10,-8,-7};
		increasingTriplet2(arr);
	}
}