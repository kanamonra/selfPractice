public class Day27 {
    public static StringBuilder solution(String str) {
        StringBuilder rstr = new StringBuilder();
        rstr.append(str);
        rstr.reverse();
        return rstr;
    }
    public static void main(String[] args) {
        System.out.println(solution("reverse"));
    }

}
