/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long n = A.length+1;
        long computedSum = (long)((n*(n+1))/2.0);

        long sum = 0;

        for (int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }

        return (int)(computedSum - sum);
    }
}
