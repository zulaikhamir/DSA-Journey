//method 1 swap the data of the nodes instead of swapping the nodes themselves. This is a simple approach but it does not work if the data of the nodes is not unique.
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
Node pairwiseSwap(Node head) {
    if(head==null || head.next==null){
        return head;
    }
    Node first=head;
    Node second=head.next;
    while(first!=null && second!=null){
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        first=second.next;
        if(first!=null){
            second=first.next;
        }
    }  return head;
}

//method 2 swap the nodes themselves instead of swapping the data. This approach works even if the data of the nodes is not unique.
//chaining the nodes together and then swapping the pointers of the nodes. This approach is more efficient than the first approach as it does not require swapping the data of the nodes.
Node pairwiseSwap(Node head) {
    if(head==null || head.next==null){
        return head;
    }
    Node first=head;
    Node second=head.next;
    head=second;
    while(first!=null && second!=null){
        Node next=second.next;
        second.next=first;// we point second node to the first node  so second will be the new head of the linked list and first will be the second node of the linked list  we dont dont do second=first becuase it will be then changing the values of the nodes and we want to swap the nodes themselves not the values of the nodes
        if(next==null || next.next==null){
            first.next=next;
            break;
        }
        first.next=next.next;
        first=next;
        second=first.next;
    }  return head;
}
