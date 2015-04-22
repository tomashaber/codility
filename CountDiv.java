/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }
}
