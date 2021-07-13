/**
 * @author zhcao
 */
public class ConvertIntToBinaryString {
    private static String ConvertIntToBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(ConvertIntToBinaryString(3));
    }
}
