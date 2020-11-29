public class Node{
	int data;
	Node[] adjacent_nodes;
	public Node(int data, int n){
		this.data = data;
		this.adjacent_nodes = new Node[n];
	}
}