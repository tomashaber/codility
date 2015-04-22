/**
 * @author Tomas Haber
 * @since 9.4.2015
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        long min = Long.MAX_VALUE;
        for (int i=1;i<=Math.sqrt(N);i++)
        {
            if (N % i == 0 )
            {

                long currentPerimeter = 2* (i+N/i);

                if (min > currentPerimeter){
                    min = currentPerimeter;
                }
            }

        }
        return (int)min;
    }
}
