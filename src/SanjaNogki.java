import java.util.Scanner;

    public class SanjaNogki {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] boxes = new int[n];

            for (int i = 0; i < n; i++) {
                boxes[i] = scanner.nextInt();
            }

            System.out.println(maxBoxes(boxes, -1, 0));
        }
        public static int maxBoxes(int[] boxes, int preBox, int idx){
            if (idx == boxes.length) {
                return 0;
            }
            int inside = 0;
            if (preBox == -1 || boxes[preBox] < boxes[idx]) {
                inside = 1 + maxBoxes(boxes, idx, idx + 1);
            }

            int not_Inside = maxBoxes(boxes, preBox, idx + 1);

            return Math.max(inside, not_Inside);
        }

}
