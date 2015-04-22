import java.util.Arrays;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i=0;i<A.length-2;i++){
            if (A[i] > (A[i+2]-A[i+1])){
                return 1;
            }
        }
        return 0;
    }
}
