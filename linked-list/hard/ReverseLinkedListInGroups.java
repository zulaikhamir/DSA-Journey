
//recursive approach
Node reverseInGroups(Node head, int k) {
    Node curr = head;
    Node prev = null;
    Node next = null;
    int count = 0;
    while(curr != null && count < k) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
    }
    if(next != null) {
        head.next = reverseInGroups(next, k);
    }
    return prev;
}

//iterative approach
Node reverseInGroups(Node head, int k) {
    Node curr = head;
    Node prevFirst = null;
    boolean isFirstPass = true;
    while(curr != null) {
        Node first = curr;
        Node prev = null;
        int count = 0;
        while(curr != null && count < k) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(isFirstPass) {
            head = prev;
            isFirstPass = false;
        } else {
            prevFirst.next = prev;
        }
        prevFirst = first;
    }
    return head;
}
