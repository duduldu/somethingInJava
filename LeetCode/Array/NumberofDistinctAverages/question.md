2465. 不同的平均值数目

给你一个下标从 0 开始长度为 偶数 的整数数组 nums 。
只要 nums 不是 空数组，你就重复执行以下步骤：
    找到 nums 中的最小值，并删除它。
    找到 nums 中的最大值，并删除它。
    计算删除两数的平均值。
两数 a 和 b 的 平均值 为 (a + b) / 2 。
    比方说，2 和 3 的平均值是 (2 + 3) / 2 = 2.5 。
返回上述过程能得到的 不同 平均值的数目。
注意 ，如果最小值或者最大值有重复元素，可以删除任意一个。

示例 1：
输入：nums = [4,1,4,0,3,5]
输出：2
解释：
1. 删除 0 和 5 ，平均值是 (0 + 5) / 2 = 2.5 ，现在 nums = [4,1,4,3] 。
2. 删除 1 和 4 ，平均值是 (1 + 4) / 2 = 2.5 ，现在 nums = [4,3] 。
3. 删除 3 和 4 ，平均值是 (3 + 4) / 2 = 3.5 。
   2.5 ，2.5 和 3.5 之中总共有 2 个不同的数，我们返回 2 。

示例 2：
输入：nums = [1,100]
输出：1
解释：
删除 1 和 100 后只有一个平均值，所以我们返回 1 。

提示：
    2 <= nums.length <= 100
    nums.length 是偶数。
    0 <= nums[i] <= 100

2465. Number of Distinct Averages

You are given a 0-indexed integer array nums of even length.
As long as nums is not empty, you must repetitively:
    Find the minimum number in nums and remove it.
    Find the maximum number in nums and remove it.
    Calculate the average of the two removed numbers.
The average of two numbers a and b is (a + b) / 2.
    For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.
Return the number of distinct averages calculated using the above process.
Note that when there is a tie for a minimum or maximum number, any can be removed.

Example 1:
Input: nums = [4,1,4,0,3,5]
Output: 2
Explanation:
1. Remove 0 and 5, and the average is (0 + 5) / 2 = 2.5. Now, nums = [4,1,4,3].
2. Remove 1 and 4. The average is (1 + 4) / 2 = 2.5, and nums = [4,3].
3. Remove 3 and 4, and the average is (3 + 4) / 2 = 3.5.
   Since there are 2 distinct numbers among 2.5, 2.5, and 3.5, we return 2.

Example 2:
Input: nums = [1,100]
Output: 1
Explanation:
There is only one average to be calculated after removing 1 and 100, so we return 1.

Constraints:
    2 <= nums.length <= 100
    nums.length is even.
    0 <= nums[i] <= 100