import java.util.*;

public class DijkstraDemo {

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static void dijkstra(List<List<Edge>> graph, int start) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Comparator.comparingInt(v -> dist[v])
        );
        pq.add(start);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (Edge e : graph.get(u)) {
                int v = e.to;
                int w = e.weight;

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(v);
                }
            }
        }

        System.out.println("Khoang cach ngan nhat tu dinh " + start + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Den dinh " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 5));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(4, 2));
        graph.get(2).add(new Edge(3, 4));
        graph.get(3).add(new Edge(0, 7));
        graph.get(3).add(new Edge(2, 6));
        graph.get(4).add(new Edge(1, 3));
        graph.get(4).add(new Edge(2, 9));
        graph.get(4).add(new Edge(3, 2));

        dijkstra(graph, 0);
    }
}
