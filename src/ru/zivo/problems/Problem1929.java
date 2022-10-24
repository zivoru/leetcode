package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/concatenation-of-array
 * Title: 1929. Concatenation of Array
 * Difficulty: Easy
 */
public class Problem1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}