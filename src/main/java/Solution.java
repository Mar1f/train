/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow =0;
        if(nums.length == 0){
            return 0;
        }
        else{
            while(fast<nums.length){
//                System.out.println("slow:"+slow+"  nums[slow]:"+nums[slow]);
//                System.out.println("fast:"+fast+"  nums[fast]:"+nums[fast]);

                if(nums[fast]==nums[slow]){
                    fast++;
                }
                else{
//                    System.out.println("slow:"+slow+"  nums[slow]:"+nums[slow]);
//                    System.out.println("fast:"+fast+"  nums[fast]:"+nums[fast]);
                    slow++;
                    System.out.println(slow);
                    nums[slow]=nums[fast];
                    System.out.println(nums[slow]);
                    System.out.println(slow);
                    fast++;
                }
            }
            return slow;
        }
    }
}
