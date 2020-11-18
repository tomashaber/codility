import java.util.Arrays;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class NumberOfDiscIntersections {
       public int solution(int[] A) {
        long[][] events = new long[A.length*2][2];
        for (int i = 0; i < A.length; i++) {
            events[2*i] = new long[]{(long)i - A[i], +1};
            events[2*i + 1] = new long[]{(long)i + A[i], -1};
        }
        Comparator<long[]> comparing0 = comparing(event -> event[0]);
        Comparator<long[]> comparing1 = Comparator.comparing(event -> -1 * event[1]);
        Arrays.sort(events, comparing0.thenComparing(comparing1));

        int intersections = 0;
        int activeCircles = 0;
        for (int i = 0; i < events.length; i++) {
            if (events[i][1] == 1) {
                intersections += activeCircles;
                activeCircles++;
            } else {
                activeCircles--;
            }
        }
        if (intersections >= 10e6) {
            return -1;
        }

        return intersections;
    }
}
