import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokEvenSquares {
    public static void main( String[] args){
        String input = "1,2,3,4,5,6,7,8,9,10";
        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        List<Integer> evenSquare = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            int number = Integer.parseInt(tokenizer.nextToken());
            if (number%2 == 0){
                evenSquare.add(number*number);
            }
        }
        System.out.println();
    }

}
