//detect and remove loop in a linked list
//time complexity O(n) and space complexity O(1)
//idea is to use Floyd's Cycle Detection Algorithm to detect the loop and then remove it by setting the next pointer of the last node in the loop to null.
//how does this algorithm work? The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a loop, the fast pointer will eventually catch up to the slow pointer. Once we detect the loop, we can find the starting point of the loop by moving one pointer to the head of the list and keeping the other pointer at the meeting point. Then we move both pointers one step at a time until they meet again. The point at which they meet will be the starting point of the loop. Finally, we can remove the loop by setting the next pointer of the last node in the loop to null.
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
void removeLoop(Node head) {
    if(head==null){
        return;
    }
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            break;
        }
    }  if(slow==fast){
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
