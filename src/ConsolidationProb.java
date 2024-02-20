import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConsolidationProb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < testCaseCount; t++) {
            String[] aLine = scanner.nextLine().split(" ");
            int aCount = Integer.parseInt(aLine[0]);
            Set<String> aSet = new HashSet<>(Arrays.asList(aLine).subList(1, aLine.length));

            String[] bLine = scanner.nextLine().split(" ");
            int bCount = Integer.parseInt(bLine[0]);
            Set<String> bSet = new HashSet<>(Arrays.asList(bLine).subList(1, bLine.length));

            Set<String> commonSet = new HashSet<>(aSet);
            commonSet.retainAll(bSet);

            System.out.println(commonSet.size());

            // Discard the remaining input line
            if (t != testCaseCount - 1) {
                scanner.nextLine();
            }
        }
    }
}
