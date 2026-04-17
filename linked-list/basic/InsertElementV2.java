//Insert node at beginning of circular linked list
//O(n)
//traverse to find last node and insert before head
static Node insertBegin(Node head, int data) {

    Node newNode = new Node(data);

    // empty list
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }

    Node curr = head;

    // find last node
    while (curr.next != head) {
        curr = curr.next;
    }

    // insert before head
    curr.next = newNode;
    newNode.next = head;

    return newNode; // new node becomes head
}


//o(1)
//swap values of head and new node and insert after head

static Node insertBeginEff(Node head, int data) {

    Node newNode = new Node(data);

    // empty list
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }

    // insert after head
    newNode.next = head.next;
    head.next = newNode;

    // swap values
    int temp = head.data;
    head.data = newNode.data;
    newNode.data = temp;

    return head;
}


