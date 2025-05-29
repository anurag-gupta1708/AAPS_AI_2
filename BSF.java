
class BSF {

    static boolean dfs(int[][] adj, int curr, int dest, boolean[] visited) {
        
        if (curr == dest)
            return true;
            
        visited[curr] = true;
        
        for (int i = 0; i < adj[curr].length; i++) {
            int nextVertex = adj[curr][i];
            
            if (!visited[nextVertex]) {
                if (dfs(adj, nextVertex, dest, visited))
                    return true;
            }
        }
        
        return false;
    }

    static boolean isReachable(int[][] adj, int src, int dest) {
        int n = adj.length;
        
        boolean[] visited = new boolean[n];
        
        return dfs(adj, src, dest, visited);
    }

    public static void main(String[] args) {
        int[][] adj = {
            {},
            {0, 2},
            {0, 3},
            {},
            {2}
        };
        int src = 1, dest = 3;
        if (isReachable(adj, src, dest)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}