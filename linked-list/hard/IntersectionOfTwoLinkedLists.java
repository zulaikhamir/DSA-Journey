//node intersection of two linked lists
//time complexity O(n) and space complexity O(1)
//method 1 create an empty set and add all the nodes of the first linked list to the set. Then traverse the second linked list and check if any node is present in the set. If yes, then return that node as the intersection point. If no node is present in the set, then return null.
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
Node getIntersectionNode(Node headA, Node headB) {
    HashSet<Node> set= new HashSet<>();
    Node curr=headA;
    while(curr!=null){
        set.add(curr);
        curr=curr.next;
    }
    curr=headB;
    while(curr!=null){
        if(set.contains(curr)){
            return curr;
        }
        curr=curr.next;
    }  return null;
}

//method 2 find the length of both linked lists and then move the pointer of the longer linked list by the difference in lengths. Then move both pointers of the linked lists one by one until they point to the same node. This node will be the intersection point. If there is no intersection point, then return null.
Node getIntersectionNode(Node headA, Node headB) {
    int lenA=0;
    int lenB=0;
    Node curr=headA;
    while(curr!=null){
        lenA++;
        curr=curr.next;
    }
    curr=headB;
    while(curr!=null){
        lenB++;
        curr=curr.next;
    }
    int diff=Math.abs(lenA-lenB);
    if(lenA>lenB){
        for(int i=0;i<diff;i++){
            headA=headA.next;
        }
    } else {
        for(int i=0;i<diff;i++){
            headB=headB.next;
        }
    }
    while(headA!=null && headB!=null){
        if(headA==headB){
            return headA;
        }
        headA=headA.next;
        headB=headB.next;
    }  return null;
}
