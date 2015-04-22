import java.util.Arrays;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int left = A[A.length-1]*A[A.length-2]*A[A.length-3];
        int right = A[0]*A[1]*A[A.length-1];
        return Math.max(left,right);
    }
}
