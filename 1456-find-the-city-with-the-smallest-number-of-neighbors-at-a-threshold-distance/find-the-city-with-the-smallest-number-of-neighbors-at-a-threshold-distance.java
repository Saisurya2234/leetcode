class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Инициализация матрицы смежности
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        // Заполнение матрицы смежности весами ребер
        for (int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }

        // Алгоритм Флойда-Уоршелла
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // Поиск города с минимальным количеством соседей в пределах distanceThreshold
        int result = -1;
        int minNeighbors = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int neighbors = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    neighbors++;
                }
            }
            if (neighbors <= minNeighbors) {
                minNeighbors = neighbors;
                result = i;
            }
        }

        return result;
    }
}