/**
 * @author Tomas Haber
 * @since 9.4.2015
 */
public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        return N / gcd(N, M);
    }

    private int gcd(int n, int m) {
        int r = n % m;
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }
}
