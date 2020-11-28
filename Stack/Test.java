public class Test{
	public static void main(String[] arg){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		stack.print();
		stack.pop();
		stack.print();
	}
}