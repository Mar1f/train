/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3}; // 使用大括号初始化数组
//        int[] nums = {2,2,1,1,1,2,2};
        Solution solution = new Solution(); // 创建Solution类的实例
        int k = solution.majorityElement(nums); // 调用方法
        System.out.println(k);
    }
}
// 1 1 2
// 1 2