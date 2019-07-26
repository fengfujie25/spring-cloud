package algorithm;

/**
 * 查找数组中重复元素
 * <p>
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * <p>
 * Input: {2, 3, 1, 0, 2, 5}
 * <p>
 * Output: 2
 *
 * @auther: fujie.feng
 * @DateT: 2019-06-26
 */
public class RepeatArray {

    private static int index = 1;

    public boolean queryRepeat(int[] nums) {
        if (nums.length < 0) return false;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                index++;
                if (nums[i] == nums[nums[i]]) {
                    System.out.println(nums[i]);
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        RepeatArray repeatArray = new RepeatArray();
        repeatArray.queryRepeat(new int[]{4, 3, 1, 0, 2, 5, 6, 7, 7});
        System.out.println(index);
    }

}