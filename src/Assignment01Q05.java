public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int len = m.length;

        boolean[] visited = new boolean[len];
        int[] distance = new int[len];
        int[] queue = new int[len];

        int curr = 0;
        int queuesize = 1;

        queue[0] = i;
        visited[i] = true;

        while (curr < queuesize) {
            int current = queue[curr];
            curr++;

            for (int k = 0; k < len; k++) {
                if (m[current][k] == 1 && !visited[k]) {
                    visited[k] = true;
                    distance[k] = distance[current] + 1;

                    if (k == j) {
                        return distance[k];
                    }

                    queue[queuesize] = k;
                    queuesize++;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
            System.out.println(
                findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
            System.out.println(
                findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
            System.out.println(
                findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
            System.out.println(
                findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
        }
    }