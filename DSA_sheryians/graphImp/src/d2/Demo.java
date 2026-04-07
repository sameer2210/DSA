package d2;

import java.io.IOException;

public class Demo {
    int rank[];
    int parent[];

    Demo(int v) {
        rank = new int[v + 1];
        parent = new int[v + 1];
        for (int i = 0; i <= v; i++) {
            parent[i] = i;
        }
    }

    void unionByRank(int u, int v) {
        int ul_u = parent[u];
        int ul_v = parent[v];
        if (ul_u == ul_v) return;
        if (rank[ul_u] > rank[ul_v]) {
            parent[ul_v] = ul_u;
        } else if (rank[ul_u] < rank[ul_v]) {
            parent[ul_u] = ul_v;
        } else {
            parent[ul_u] = ul_v;
            rank[ul_v]++;
        }
    }

    int findByparent(int u) {
        if (u == parent[u]) return u;
        return parent[u] = findByparent(parent[u]);
    }

    public static void main(String[] args) throws IOException {
        Demo obj = new Demo(7);
        obj.unionByRank(1, 2);
        obj.unionByRank(2, 3);
        obj.unionByRank(4, 5);
        obj.unionByRank(6, 7);
        obj.unionByRank(5, 6);
        if (obj.findByparent(3) == obj.findByparent(7)) {
            System.out.println("yes");
        } else System.out.println("no");
        obj.unionByRank(3, 7);
        if (obj.findByparent(3) == obj.findByparent(7)) {
            System.out.println("yes");
        } else System.out.println("no");

    }
}
