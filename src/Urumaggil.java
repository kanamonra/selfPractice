import java.util.Scanner;

public class Urumaggil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++){
            heights[i] = scanner.nextInt();
        }
        System.out.println(largest(N, heights));
    }
    private static int largest(int N, int[] heights) {
        int max = 0;
        int currentStart = 0;

        for (int i = 1; i < N; i++){
            if (heights[i] > heights[i-1]){
                int currentClimb = heights[i] - heights[currentStart];
                max= Math.max(max, currentClimb);
            } else {
                currentStart = i;
            }
        }
        return max;
    }
}
