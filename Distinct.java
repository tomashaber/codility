import java.util.HashSet;
import java.util.Set;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class Distinct {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<A.length;i++)
        {
            set.add(A[i]);
        }
        return set.size();
    }
}
