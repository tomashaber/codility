import java.util.Stack;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        int number_of_fish = 0;

        Stack<Integer> downstream = new Stack<>();

        for (int i=0;i<A.length;i++) {
            if (B[i] == 1) {
                downstream.push(A[i]);
            } else {

                while (downstream.size() > 0) {
                    if (downstream.peek() < A[i]) {
                        downstream.pop();
                    } else {
                        break;
                    }
                }
                if (downstream.size() == 0) {
                    number_of_fish++;
                }
            }
        }


        number_of_fish += downstream.size();
        return number_of_fish;
    }
}
