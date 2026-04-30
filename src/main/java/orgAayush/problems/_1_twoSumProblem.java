package orgAayush.problems;

import java.util.HashMap;

public class _1_twoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer , Integer>  pair = new HashMap<>();

        pair.put(nums[0], 0 );

        for (int i = 1 ; i < nums.length ; i++){

            if ( pair.containsKey(target- nums[i])){

                return new int[]{pair.get(target - nums[i]) , i};
            }

            pair.put(nums[i],i);
        }
        return new int[]{9999, 9999};
    }

}
