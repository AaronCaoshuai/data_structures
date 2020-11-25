//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 867 👎 0

package aaron.leetcode.editor.cn;

public class MoveZeroes {

    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
//            function1(nums);
            function2(nums);
        }

        /**
         * 双指针交换元素
         * 时间复杂度:O(n)
         *
         * @param nums
         */
        private void function2(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    //交换元素
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }

        /**
         * 1.非0元素向前移动到数组前面
         * 2.后面位置补充0
         * 时间复杂度:O(n)
         * @param nums
         */
        private void function1(int[] nums) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index] = nums[i];
                    index ++;
                }
            }
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
    

