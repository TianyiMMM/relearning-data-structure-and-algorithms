public class Stack{
	public class stackNode{
		protected int data;
		protected stackNode next;
		public stackNode(int data){
			this.data = data;
			this.next = null;
		}
	}

	protected stackNode top = null;

	public int pop(){
		int item = -1;
		if (top != null){
			item = top.data;
			top = top.next;
		} 
		return item;
	}

	public void push(int item){
		stackNode node = new stackNode(item);
		node.next = top;
		top = node;
	}

	public int peek(){
		return top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}

	public void print(){
		stackNode node = top;
		while (node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
}