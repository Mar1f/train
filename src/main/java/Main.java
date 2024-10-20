/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
public class Main {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7}; // 使用大括号初始化数组
//        int[] nums = {-1,-100,3,99};
        int[] nums = {-1};
        int k = 2; // 定义变量k
        Solution solution = new Solution(); // 创建Solution类的实例
        solution.rotate(nums,k); // 调用方法
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
// 1 1 2
// 1 2