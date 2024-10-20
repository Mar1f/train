import java.util.Arrays;

import static java.lang.Math.max;

/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
//、
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[n-1][0];

    }
}

//class Solution {
//    public void rotate(int[] nums, int k) {
////        System.out.println(nums.length);
//        if (nums.length <=1) {
//            return;
//        } else {
//            if(k>nums.length) {
//                k%= nums.length;
//            }
//            int a = nums.length - k;
//            int s = 0;
//            int[] arr = new int[nums.length];
//            for (int i = a; i < nums.length; i++) {
//                arr[s++] = nums[i];
//            }
//            for (int i = 0; i < a; i++) {
//                arr[s++] = nums[i];
//            }
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = arr[i];
//            }
//        }
//    }
//}
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for (int x : nums) {
//            if (i < 2 || nums[i- 2] != x) nums[i++] = x;
//        }
//        return i;
//    }
//}
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int fast = 1;
//        int slow =0;
//        if(nums.length == 0){
//            return 0;
//        }
//        else{
//            while(fast<nums.length){
////                System.out.println("slow:"+slow+"  nums[slow]:"+nums[slow]);
////                System.out.println("fast:"+fast+"  nums[fast]:"+nums[fast]);
//
//                if(nums[fast]==nums[slow]){
//                    fast++;
//                }
//                else{
////                    System.out.println("slow:"+slow+"  nums[slow]:"+nums[slow]);
////                    System.out.println("fast:"+fast+"  nums[fast]:"+nums[fast]);
//                    slow++;
//                    System.out.println(slow);
//                    nums[slow]=nums[fast];
//                    System.out.println(nums[slow]);
//                    System.out.println(slow);
//                    fast++;
//                }
//            }
//            return slow;
//        }
//    }
//}
