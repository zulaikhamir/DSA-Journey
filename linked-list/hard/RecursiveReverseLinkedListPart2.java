Node recursiveReverseList(Node curr,  Node prev) {
    if(curr == null) {
        return prev;
    }
    Node next = curr.next;
    curr.next = prev;
    return recursiveReverseList(next, curr);
}
