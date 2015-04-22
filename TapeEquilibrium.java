/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        long sum = 0;
        for (int i=0;i<A.length;i++)
        {
            sum+= A[i];
        }
        long first_part = 0 ;
        long min = Long.MAX_VALUE;

        for (int i=0;i<A.length-1;i++){
            first_part+=A[i];
            sum-=A[i];

            long difference = Math.abs(sum - first_part);
            if (difference < min){
                min = difference;
            }
        }
        return (int)min;
    }
}
