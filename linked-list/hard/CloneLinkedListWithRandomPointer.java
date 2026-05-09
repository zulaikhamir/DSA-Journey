//create a hashmap to store the mapping of original nodes to their corresponding cloned nodes. Then traverse the original linked list and for each node, create a new node with the same value and add it to the hash map. After that, traverse the original linked list again and for each node, set the next and random pointers of the corresponding cloned node using the hash map. Finally, return the head of the cloned linked list.
//time complexity O(n) and space complexity O(n)
class Node {
    int data;
    Node next;
    Node random;
    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
Node copyRandomList(Node head) {
    if(head==null){
        return null;
    }
    HashMap<Node,Node> map= new HashMap<>();
    Node curr=head;
    while(curr!=null){
        map.put(curr,new Node(curr.data));
        curr=curr.next;
    }
    curr=head;
    while(curr!=null){
        map.get(curr).next=map.get(curr.next);
        map.get(curr).random=map.get(curr.random);
        curr=curr.next;
    }  return map.get(head);
}

//method 2 without using extra space
//time complexity O(n) and space complexity O(1)
Node copyRandomList(Node head) {
    if(head==null){
        return null;
    }
    Node curr=head;
    while(curr!=null){
        Node newNode=new Node(curr.data);
        newNode.next=curr.next;
        curr.next=newNode;
        curr=curr.next.next;
    }
    curr=head;
    while(curr!=null){
        if(curr.random!=null){
            curr.next.random=curr.random.next;
        }
        curr=curr.next.next;
    }
    Node newHead=head.next;
    curr=head;
    while(curr!=null){
        Node temp=curr.next;
        curr.next=temp.next;
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        curr=curr.next;
    }  return newHead;
}
