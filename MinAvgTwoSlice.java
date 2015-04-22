/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        double min = Double.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i=0;i<A.length-2;i++)
        {
            double avg1 = (A[i]+A[i+1]+A[i+2])/3.0;

            if (avg1 < min){
                min = avg1;
                index = i;
            }

            double avg2 = (A[i]+A[i+1])/2.0;

            if (avg2 < min){
                min = avg2;
                index = i;
            }
        }

        double avg = (A[A.length-1]+A[A.length-2])/2;
        if (avg < min){
            min = avg;
            index = A.length-2;
        }
        return index;
    }
}
