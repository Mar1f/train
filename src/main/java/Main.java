/**
 * @description；
 * @author:mar1
 * @data:2024/10/19
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // 使用大括号初始化数组
        Solution solution = new Solution(); // 创建Solution类的实例
        int k = solution.removeDuplicates(nums); // 调用方法
        System.out.println("新长度: " + k); // 输出结果
    }
}
// 1 1 2
// 1 2