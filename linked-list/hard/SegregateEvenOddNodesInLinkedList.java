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
            if(evenHead==null){//ist when we encounter first even node
                evenHead=curr;//we will make even head and even tail point to the first even node
                evenTail=curr;
            } else {
                evenTail.next=curr;//we will make the next of even tail point to the current node and then move the even tail to the next node which is the current node
                evenTail=evenTail.next;//both current and even tail will point to the next node which is the current node because we have already made the next of even tail point to the current node
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
        curr=curr.next;//after processing the current node we will move to the next node
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
