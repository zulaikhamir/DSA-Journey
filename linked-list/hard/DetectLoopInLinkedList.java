//if modification to linked list is allowed
//time and space complexity O(n) and O(1) respectively
struct Node {
    int data;
    Node next;
    bool visited;
    Node(int x) {
        data = x;
        next = null;
        visited = false;
    }
}
//modifications to linked list pointer reference
//time and space complexity O(n) and O(1) respectively
// This is the destructive marking approach. It detects a cycle by mutating the list — pointing every visited node's next to a sentinel node (temp).
// The logic:

// If you ever see a node whose next is already temp, you've visited it before → cycle exists
// If you reach null, no cycle

// The problem: it destroys the original list. Every node's next gets overwritten. You can never traverse this list again after calling this method. That's why it's rarely used.
public boolean hasCycle(Node head) {
    Node temp= new node;
    Node curr=head;
    while(curr!=null){
        if(curr.next==null){
            return false;
        }
        if(curr.next==temp){
            return true;
        }
        Node next=curr.next;
        curr.next=temp;
        curr=next;
    }  return false;
}
//hashing
//time and space complexity O(n) and O(n) respectively
public boolean hasCycle(Node head) {
    HashSet<Node> set= new HashSet<>();
    Node curr=head;
    while(curr!=null){
        if(set.contains(curr)){
            return true;
        }
        set.add(curr);
        curr=curr.next;
    }  return false;
}
