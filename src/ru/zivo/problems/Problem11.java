package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/container-with-most-water
 * Title: 11. Container With Most Water
 * Difficulty: Medium
 */
public class Problem11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area;
            if (height[left] < height[right]) {
                area = height[left] * (right - left);
                if (area > maxArea) {
                    maxArea = area;
                }
                left++;
            } else {
                area = height[right] * (right - left);
                if (area > maxArea) {
                    maxArea = area;
                }
                right--;
            }
        }

        return maxArea;
    }
}
