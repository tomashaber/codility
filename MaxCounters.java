/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        long current_max = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;

        for (int i=0;i<A.length;i++)
        {
            if (A[i] == N+1){
                max = current_max;
            } else {
                if (counters[A[i]-1] < max){
                    counters[A[i]-1] = (int)max;
                }

                counters[A[i]-1]+=1;

                if (counters[A[i]-1] > current_max ){
                    current_max = counters[A[i]-1];
                }
            }
        }

        for (int i=0;i<counters.length;i++)
        {
            if (counters[i]<max){
                counters[i]=(int)max;
            }
        }

        return counters;
    }
}
