import java.util.HashSet;
import java.util.Set;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class FrogRiverOne {
    public int solution (int X, int[] A){

        int[]counter = new int[X+1];

        int x = 0;

        for (int i=0; i<A.length; i++){
            if (counter[A[i]] == 0){
                counter[A[i]] = A[i];
                x += 1;
                if (x == X){
                    return i;
                }
            }
        }

        return -1;
    }
}
