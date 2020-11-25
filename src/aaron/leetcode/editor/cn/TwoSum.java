//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9683 👎 0

package aaron.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
//            int[] rtn = function1(nums, target);
            int[] rtn = function2(nums,target);
            return rtn;
        }
        //2.哈希表
        private int[] function2(int[] nums, int target) {
            int[] rtn = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(target - nums[i])){
                    rtn[0] = i;
                    rtn[1] = map.get(target - nums[i]);
                    return rtn;
                }
                map.put(nums[i],i);
            }
            return rtn;
        }

        //1.暴力破解 时间复杂度 O(n^2)
        private int[] function1(int[] nums, int target) {
            int[] rtn = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        rtn[0] = i;
                        rtn[1] = j;
                        return rtn;
                    }
                }
            }
            return rtn;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
    

