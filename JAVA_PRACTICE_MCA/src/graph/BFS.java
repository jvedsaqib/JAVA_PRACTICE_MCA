package graph;

import java.util.*;

public class BFS {
	public int[][] adj;

	BFS(int v) {
		adj = new int[v][v];
	}

	public void addEdge(int x, int y) {
		adj[x][y] = 1;
		adj[y][x] = 1;
	}

	public void bfs(int a) {
		boolean[] visited = new boolean[adj.length];
		Queue<Integer> queue = new LinkedList<>();

		visited[a] = true;
		queue.add(a);

		while (!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.print(currentNode + " ");

			for (int i = 0; i < adj[currentNode].length; i++) {
				if (adj[currentNode][i] == 1 && !visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}