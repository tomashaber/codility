/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class Dominator {
    public int solution(int[] A) {

        long size = 0;
        long value = 0;

        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size += 1;
                value = A[i];
            } else {
                if (value != A[i]) {
                    size -= 1;
                } else {
                    size += 1;
                }
            }
        }

        long candidate = -1;
        if (size > 0) {
            candidate = value;
        }

        long leader = -1;
        long count = 0;
        long candidate_index = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count += 1;
                candidate_index = i;
            }
        }

        if (count > A.length / 2) {
            leader = candidate_index;
        }
        return (int) leader;
    }
}
