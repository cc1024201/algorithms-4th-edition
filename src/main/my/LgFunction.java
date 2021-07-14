/**
 * @author zhcao
 */
public class LgFunction {
    private static int lg(int N) {
        int num = 0;
        while (N / 2 != 0) {
            N = N / 2;
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.printf("结果是：%s\n", lg(value));
    }
}
