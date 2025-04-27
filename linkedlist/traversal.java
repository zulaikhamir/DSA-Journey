public class traversal{
	public static void main(String[] args) {
Node head= new Node(10);
head.next=new Node(20);
head.next.next= new Node(30);

System.out.println("iterative traversal");
iterative(head);

System.out.println("Recursive soln");
recursive(head);
		
	}
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	static void iterative(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data+" ");
			curr=curr.next;
		}

	}
	static void recursive(Node head){
		if(head==null){
			return;
		}
		

		System.out.println(head.data +" ");
		recursive(head.next);

	}
}