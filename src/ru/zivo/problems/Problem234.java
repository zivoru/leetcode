package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/palindrome-linked-list
 * Title: 234. Palindrome Linked List
 * Difficulty: Easy
 */
public class Problem234 {
    public boolean isPalindrome(ListNode head) {
        int i = 0, j = 0, k = 1;
        while (head != null) {
            i = i * 10 + head.val;
            j += head.val * k;
            k *= 10;
            head = head.next;
        }
        return i == j;
    }
}
