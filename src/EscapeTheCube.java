import java.util.*;
import java.io.*;

public class EscapeTheCube{
    static int m, n;
    static int[][] map;
    static int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test = 0; test < T; test++) {
            String[] nm = br.readLine().split(" ");
            n = Integer.parseInt(nm[0]);
            m = Integer.parseInt(nm[1]);
            map = new int[m][n];
            int rooms = 0;
            Node start = null;
            for(int i = 0; i < m; i++) {
                String[] row = br.readLine().split(" ");
                for(int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(row[j]);
                    if(map[i][j] == 0) {
                        rooms++;
                        if(start == null) {
                            start = new Node(i, j);
                        }
                    }
                }
            }

            if(bfs(start, rooms)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static boolean bfs(Node start, int rooms) {
        boolean[][] visited = new boolean[m][n];
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        int visitedRooms = 0;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if(visited[node.x][node.y]) {
                continue;
            }
            visited[node.x][node.y] = true;
            visitedRooms++;
            for(int[] dir : dirs) {
                int newX = node.x + dir[0];
                int newY = node.y + dir[1];
                if(newX >= 0 && newX < m && newY >= 0 && newY < n && map[newX][newY] == 0) {
                    queue.add(new Node(newX, newY));
                }
            }
        }
        return visitedRooms == rooms && visited[start.x][start.y];
    }
}

