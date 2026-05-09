//method 1 using deque
//time complexity O(n) and space complexity O(n)
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
boolean isPalindrome(Node head) {
    Deque<Integer> deque = new ArrayDeque<>();
    Node curr = head;
    while(curr != null) {
        deque.addLast(curr.data);
        curr = curr.next;
    }
    while(!deque.isEmpty()) {
        if(deque.removeFirst() != deque.removeLast()) {
            return false;
        }
    }
    return true;
}

//method 2 using fast and slow pointers
//time complexity O(n) and space complexity O(1)
boolean isPalindrome(Node head) {
    if(head == null || head.next == null) {
        return true;
    }
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node secondHalfHead = reverseList(slow);
    Node firstHalfHead = head;
    while(secondHalfHead != null) {
        if(firstHalfHead.data != secondHalfHead.data) {
            return false;
        }
        firstHalfHead = firstHalfHead.next;
        secondHalfHead = secondHalfHead.next;
    }
    return true;
}
