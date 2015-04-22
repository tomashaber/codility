/**
 * @author Tomas Haber
 * @since 9.4.2015
 */
public class MaxSlice {
    public int solution(int[] A) {
        long max_slice_ending_here = A[0];
        long max_slice = A[0];

        for (int i = 1; i < A.length; i++) {
            int element = A[i];
            max_slice_ending_here = Math.max(element, max_slice_ending_here + element);
            max_slice = Math.max(max_slice, max_slice_ending_here);
        }
        return (int) max_slice;
    }
}
