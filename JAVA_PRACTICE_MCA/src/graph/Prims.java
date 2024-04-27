package graph;

import java.util.*;

class Node implements Comparator<Node>{
    private int v;
    private int w;

    Node(int v, int w){
        this.v = v;
        this.w = w;
    }

    public Node() {}

    int getV() { return this.v; }
    int getW() { return this.w; }

    @Override
    public int compare(Node node0, Node node1) {
        if (node0.w < node1.w)
            return -1;
        if (node0.w > node1.w)
            return 1;
        return 0;
    }

}

public class Prims {

    private final int INF = 1000000;

    void prims(ArrayList<ArrayList<Node> > adj, int N){
        int key[] = new int[N];
        int parent[] = new int[N];
        boolean mstSet[] = new boolean[N];

        for(int i = 0; i < N; i++){
            key[i] = INF;
            mstSet[i] = false;
            parent[i] = -1;
        }

        PriorityQueue<Node> pq = new PriorityQueue<Node>(N, new Node());

        key[0] = 0;
        pq.add(new Node(0, key[0]));

        for(int i = 0; i < N-1; i++){
            int u = pq.poll().getV();
            mstSet[u] = true;

            for(Node it : adj.get(u)){
                if(mstSet[it.getV()] == false && it.getW() < key[it.getV()]) {
                    parent[it.getV()] = u;
                    key[it.getV()] = it.getW();
                    pq.add(new Node(it.getV(), key[it.getV()]));
                }
            }
        }

        for(int i = 1; i < N; i++){
            System.out.println(parent[i] + " - " + i);
        }

    }

}
