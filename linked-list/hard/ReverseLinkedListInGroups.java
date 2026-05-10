
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
    Node prevFirst = null;//this node will point to the first node of the previous group, so that we can connect it to the first node of the current group after reversing
    boolean isFirstPass = true;
    while(curr != null) {
        Node first = curr;//this node will point to the first node of the current group, so that we can connect it to the first node of the next group after reversing
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
            prevFirst.next = prev;//after reversing the current group, the first node of the current group becomes the last node, so we need to connect it to the first node of the next group
        }
        prevFirst = first;//after reversing the current group, the first node of the current group becomes the last node, so we need to connect it to the first node of the next group in the next iteration
    }
    return head;
}
