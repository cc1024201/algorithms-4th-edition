/**
 * 编写一个递归的静态方法计算ln(N!)的值
 * <p>
 * 对数基本公式 https://baike.baidu.com/item/%E5%AF%B9%E6%95%B0%E5%85%AC%E5%BC%8F/5557846
 *
 * @author zhcao
 */
public class MyLnN {
    public static void main(String[] args) {
        double n = 10;
        StdOut.printf("ln(" + n + ")=%f", ln(n));
    }

    private static double ln(double N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + ln(N - 1);
    }
}
