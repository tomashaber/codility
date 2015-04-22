/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class PassingCars {
    public int solution(int[] A) {
        int number_of_pairs = 0;
        int number_of_zeroes = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                number_of_zeroes += 1;
            } else {
                if (A[i] == 1) {
                    number_of_pairs += number_of_zeroes;
                }
            }

            if (number_of_pairs > 1000000000){
                return -1;
            }
        }
        return number_of_pairs;
    }
}
