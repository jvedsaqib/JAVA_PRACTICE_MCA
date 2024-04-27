package graph;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {

//		int v = 6;	// vertices
//		
//		DFS ob = new DFS(v);
//
//		ob.addEdge(0, 1);
//		ob.addEdge(0, 2);
//		ob.addEdge(1, 3);
//		ob.addEdge(2, 4);
//		ob.addEdge(2, 5);
//
//		boolean[] visited = new boolean[v];
//
//		ob.dfs(0, visited);

//		--------------------------- DFS END ---------------------

		// int v = 6; // vertices

		// BFS ob = new BFS(v);

		// ob.addEdge(0, 1);
		// ob.addEdge(0, 2);
		// ob.addEdge(1, 3);
		// ob.addEdge(2, 4);
		// ob.addEdge(2, 5);

		// ob.bfs(0);

//		--------------------------- BFS END ---------------------


		// int n = 5;
		// ArrayList<ArrayList<Node> > adj = new ArrayList<ArrayList<Node> > ();

		// for(int i = 0; i < n; i++)
		// 	adj.add(new ArrayList<Node>());

		// adj.get(0).add(new Node(1, 2));
		// adj.get(1).add(new Node(0, 2));

		// adj.get(1).add(new Node(2, 3));
		// adj.get(2).add(new Node(1, 3));

		// adj.get(0).add(new Node(3, 6));
		// adj.get(3).add(new Node(0, 6));

		// adj.get(1).add(new Node(3, 8));
		// adj.get(3).add(new Node(1, 8));

		// adj.get(1).add(new Node(4, 5));
		// adj.get(4).add(new Node(1, 5));

		// adj.get(2).add(new Node(4, 7));
		// adj.get(4).add(new Node(2, 7));

		// Prims ob = new Prims();

		// ob.prims(adj, n);

//		--------------------------- PRIMS END ---------------------

		int V = 4;  // Number of vertices in graph
		int E = 5;  // Number of edges in graph
		Kruskal
		graph = new Kruskal
		(V, E);

		graph.edges[0].src = 0;
		graph.edges[0].dest = 1;
		graph.edges[0].weight = 10;

		graph.edges[1].src = 0;
		graph.edges[1].dest = 2;
		graph.edges[1].weight = 6;

		graph.edges[2].src = 0;
		graph.edges[2].dest = 3;
		graph.edges[2].weight = 5;

		graph.edges[3].src = 1;
		graph.edges[3].dest = 3;
		graph.edges[3].weight = 15;

		graph.edges[4].src = 2;
		graph.edges[4].dest = 3;
		graph.edges[4].weight = 4;

		graph.kruskalMST();

	}

}
