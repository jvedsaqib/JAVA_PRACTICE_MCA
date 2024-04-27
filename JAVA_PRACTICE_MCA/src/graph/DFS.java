package graph;

//import java.util.*;

/*
 * DFS(G, u)
    u.visited = true
    for each v ∈ G.Adj[u]
        if v.visited == false
            DFS(G,v)
 * 
 */

class DFS {
	public int[][] adj;

	DFS(int v) {
		adj = new int[v][v];
	}

	public void addEdge(int x, int y) {
		adj[x][y] = 1;
		adj[y][x] = 1;
	}

	public void dfs(int a, boolean[] visited) {

		System.out.print(a + " ");

		visited[a] = true;

		for (int i = 0; i < adj[a].length; i++) {

			if (adj[a][i] == 1 && (!visited[i])) {
				dfs(i, visited);
			}
		}
	}
}
