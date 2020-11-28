public class Queue{
	public class QueueNode{
		int data;
		QueueNode next;

		public QueueNode(int data){
			this.data = data;
			this.next = null;
		}
	}

	QueueNode first = null;
	QueueNode last = null;

	public void addFirst(int data){
		QueueNode node = new QueueNode(data);
		if (first==null && last == null){
			first = node;
			last = first;
		} else {
			node.next = first;
			first = node;
		}
	}

	public int removeTail(){
		int data = last.data;
		QueueNode node = first;
		while (node.next.next != null){
			node = node.next;
		}
		node.next = null;
		last = node;
		return data;
	}

	public void addTail(int data){
		QueueNode node = new QueueNode(data);
		if (last != null){
			last.next = node;
		}
		last = node;
		if (first == null){
			first = last;
		}
	}

	public int removeHead(){
		int data = -1;
		if (first != null){
			data = first.data;
			first = first.next;
			if (first == null){
				last = null;
			}
		}
		return data;
	}

	public int peek(){
		return first.data;
	}

	public boolean isEmpty(){
		return first==null;
	}

	public void print(){
		QueueNode node = first;
		while (node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
}