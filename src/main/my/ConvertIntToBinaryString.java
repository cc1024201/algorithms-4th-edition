/**
 * 编写一段代码，将一个正整数N用二进制表示并转换为一个String类型的值s?
 *
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
