/**
 * 编写一个静态方法lg()，接受一个整型参数N，返回不大于log2N的最大整数,不要使用Math库。
 *
 * @author zhcao
 */
public class MyLgFunction {
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
