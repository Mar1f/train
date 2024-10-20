import java.util.Arrays;

import static java.lang.Math.max;

/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
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
