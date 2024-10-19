/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3}; // 使用大括号初始化数组
        Solution solution = new Solution(); // 创建Solution类的实例
        int k = solution.removeDuplicates(nums); // 调用方法
        System.out.println("新长度: " + k); // 输出结果
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
// 1 1 2
// 1 2