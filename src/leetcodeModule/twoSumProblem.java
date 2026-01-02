package leetcodeModule;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumProblem {
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

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;


        twoSumProblem tp = new twoSumProblem();

        int[ ]rest = tp.twoSum(nums,target);

        System.out.println(Arrays.toString(rest));

    }
}
