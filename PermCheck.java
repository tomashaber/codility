import java.util.HashSet;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        long max = Long.MIN_VALUE;
        for (int i=0;i<A.length;i++){
            if (max < A[i])
            {
                max = A[i];
            }
        }

        if (A.length != max){
            return 0;
        }

        for (int i=0;i<A.length;i++){
            if (set.contains(A[i])){
                return 0;
            }

            set.add(A[i]);
        }
        return 1;
    }
}
