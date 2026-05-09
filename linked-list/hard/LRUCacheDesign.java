//LRU Cache Design using Doubly Linked List and HashMap
//time complexity O(1) for get and put operations and space complexity O(capacity)
//idea is to use a doubly linked list to store the keys and values of the cache and a hash map to store the key and the corresponding node in the linked list. The head of the linked list will be the most recently used item and the tail will be the least recently used item. When we get an item from the cache, we move it to the head of the linked list. When we put an item in the cache, we add it to the head of the linked list and if the cache is full, we remove the tail of the linked list and remove the corresponding entry from the hash map.
class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
    HashMap<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
        } else {
            if (map.size() == capacity) {
                Node lastNode = tail.prev;
                removeNode(lastNode);
                map.remove(lastNode.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addNode(newNode);
        }
    }

    private void addNode(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
