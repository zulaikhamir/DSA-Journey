//detect loop using Floyd's Cycle Detection Algorithm
//loop means cycle in the linked list
//time complexity O(n) and space complexity O(1)
//idea is to use two pointers, one slow and one fast, and move them at different speeds. If there is a loop, the fast pointer will eventually meet the slow pointer. If there is no loop, the fast pointer will reach the end of the list.
//how does this algorithm work? The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a loop, the fast pointer will eventually catch up to the slow pointer. If there is no loop, the fast pointer will reach the end of the list (null) and we can conclude that there is no loop.
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
boolean isloop(Node head) {
    if(head==null){
        return false;
    }
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }  return false;
}
