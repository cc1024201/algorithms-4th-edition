/**
 * 编写一个静态方法histogram()，接收一个整型数组a[]和一个整数M为参数并返回一个大小为M 的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。
 * 如果a[]中的值均在0在M-1之间，返回数组中所有元素之和应该和a.length相等。
 *
 * @author zhcao
 */
public class MyHistogram {
    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            //只接收0~M-1的值(下标限制)，满足这个条件，就让下标对应的数字+1
            if (a[i] >= 0 && a[i] < M) {
                result[a[i]]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2, 10};
        int[] result = histogram(a, 8);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%3d", result[i]);
        }
    }
}
