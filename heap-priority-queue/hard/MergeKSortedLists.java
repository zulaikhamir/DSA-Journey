// LeetCode 23 - Merge K Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/
// Merge k sorted linked lists into one sorted linked list.
// Approach: min-heap of the current head of each list; repeatedly pop the smallest,
// append it to the result, and push its next node if any.
// Time: O(N log k) where N is total nodes across all lists, Space: O(k)

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MergeKSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode merged = mergeKLists(new ListNode[]{l1, l2, l3});

        StringBuilder sb = new StringBuilder();
        while (merged != null) {
            sb.append(merged.val).append(" ");
            merged = merged.next;
        }
        System.out.println("Merged list: " + sb.toString().trim());
    }

    static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}
