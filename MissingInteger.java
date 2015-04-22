/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class MissingInteger {
    public int solution(int[] A) {

        boolean occurs[] = new boolean [A.length + 1];
        for (int i=0;i<A.length;i++){
            if (A[i]>=1 && A[i]<=A.length+1){
                occurs[A[i]-1] = true;
            }
        }

        for (int i=0;i<occurs.length;i++){
            if (!occurs[i]){
                return i+1;
            }
        }

        return -1;
    }
}
