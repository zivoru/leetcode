package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/task-scheduler
 * Title: 621. Task Scheduler
 * Difficulty: Medium
 */
public class Problem621 {
    public int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0, maxCount = 0;
        for (char task : tasks) {
            counter[task - 'A']++;
            if (max == counter[task - 'A']) {
                maxCount++;
            } else if (max < counter[task - 'A']) {
                max = counter[task - 'A'];
                maxCount = 1;
            }
        }

        int partCount = max - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }
}
