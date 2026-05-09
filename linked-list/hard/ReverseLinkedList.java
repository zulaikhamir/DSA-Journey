//naiave soln
Node reverseList(Node head) {
    ArrayList<Integer> list = new ArrayList<>();
    for(Node cur = head; cur != null; cur = cur.next) {
        list.add(cur.val);
    }
    for(Node cur = head; cur != null; cur = cur.next) {
        cur.val = list.remove(list.size() - 1);
    }
    return head;
}

//efficient soln
Node reverseList(Node head) {
    Node prev = null;
    Node cur = head;
    while(cur != null) {
        Node next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }
    return prev;
}
