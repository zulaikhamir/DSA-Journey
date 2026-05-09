//time complexity O(m+n) and space complexity O(1)
Node mergeTwoSortedLists(Node head1, Node head2) {
    Node dummy = new Node(-1);
    Node curr = dummy;
    while(head1!=null && head2!=null){
        if(head1.data<head2.data){
            curr.next = head1;
            head1 = head1.next;
        } else {
            curr.next = head2;
            head2 = head2.next;
        }
        curr = curr.next;
    }
    if(head1!=null){
        curr.next = head1;
    } else {
        curr.next = head2;
    }
    return dummy.next;
}
//without using dummy node
Node mergeTwoSortedLists(Node head1, Node head2) {
    if(head1==null){
        return head2;
    }
    if(head2==null){
        return head1;
    }
    Node head=null;
    if(head1.data<head2.data){
        head=head1;
        head1=head1.next;
    } else {
        head=head2;
        head2=head2.next;
    }
    Node curr=head;
    while(head1!=null && head2!=null){
        if(head1.data<head2.data){
            curr.next = head1;
            head1 = head1.next;
        } else {
            curr.next = head2;
            head2 = head2.next;
        }
        curr = curr.next;
    }
    if(head1!=null){
        curr.next = head1;
    } else {
        curr.next = head2;
    }
    return head;
}
