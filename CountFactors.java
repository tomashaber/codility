/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class CountFactors {

    public static int solution(int N) {
        long i = 1;
        long result = 0;
        while (i < Math.sqrt(N)) {
            if (N % i == 0) {
                result += 2;
                i += 1;
            } else {
                i += 1;
            }
        }
        if (i * i == N) {
            result += 1;
        }
        return (int)result;
    }
}
