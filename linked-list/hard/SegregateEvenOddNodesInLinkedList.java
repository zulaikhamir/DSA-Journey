Node segregate(Node head) {
    if(head==null){
        return null;
    }
    Node evenHead=null;
    Node evenTail=null;
    Node oddHead=null;
    Node oddTail=null;
    Node curr=head;
    while(curr!=null){
        if(curr.data%2==0){
            if(evenHead==null){
                evenHead=curr;
                evenTail=curr;
            } else {
                evenTail.next=curr;
                evenTail=evenTail.next;
            }
        } else {
            if(oddHead==null){
                oddHead=curr;
                oddTail=curr;
            } else {
                oddTail.next=curr;
                oddTail=oddTail.next;
            }
        }
        curr=curr.next;
    }  if(evenHead==null){
        return oddHead;
    }
    if(oddHead==null){
        return evenHead;
    }
    evenTail.next=oddHead;
    oddTail.next=null;
    return evenHead;
}
