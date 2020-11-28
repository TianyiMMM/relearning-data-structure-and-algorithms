public class Test{
	public static void main(String[] arg){
		Queue q = new Queue();
		q.addFirst(1);
		q.addFirst(2);
		q.addFirst(3);
		q.addFirst(4);
		System.out.println(q.peek());
		q.print();
		q.removeTail();
		q.print();
		Queue q2 = new Queue();
		q.addTail(1);
		q2.addTail(2);
		q.print();
	}
}