import java.util.Arrays;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A) {

        long intersections = 0;
        long[] upper = new long[A.length];
        long[] lower = new long[A.length];


        for (int i=0;i<A.length;i++){
            upper[i] = i + A[i];
            lower[i] = i - A[i];
        }

        Arrays.sort(upper);
        Arrays.sort(lower);

        int lower_index = 0;

        for (int i=0;i<upper.length;i++)
        {
            while ( lower_index < A.length && upper[i]>=lower[lower_index] )
            {
                lower_index++;
            }

            intersections+= lower_index - i - 1;
        }
        if (intersections > 10000000){
            return -1;
        }

        return (int)intersections;
    }
}
