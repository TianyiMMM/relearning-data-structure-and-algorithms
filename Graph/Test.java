public class Test{
	public static void main(String[] arg){
		// a graph with nodes with 1 < data <= n, nodes' adjacent nodes list length <= 10
		// example from page.107 of Crack the Technical Interview
		n = 10;
		Graph g = new Graph(n);
		Node n0 = new Node(0, n);
		Node n1 = new Node(1, n);
		Node n2 = new Node(2, n);
		Node n3 = new Node(3, n);
		Node n4 = new Node(4, n);
		Node n5 = new Node(5, n);
		Node[] nodes = {n0, n1, n2, n3, n4, n5};
		g.addNodes(nodes);
		g.addEdge(n0, n1);
		g.addEdge(n0, n4);
		g.addEdge(n0, n5);
		g.addEdge(n1, n3);
		g.addEdge(n1, n4);
		g.addEdge(n2, n1);
		g.addEdge(n3, n2);
		g.addEdge(n3, n4);
		g.print();
	}
}