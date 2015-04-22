/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class GenomicRangeQuery {

    public int[] solution(String s, int[] P, int[] Q) {
        int[][] occurence = new int[4][s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'A':
                    occurence[0][i]++;
                    break;
                case 'C':
                    occurence[1][i]++;
                    break;
                case 'G':
                    occurence[2][i]++;
                    break;
                case 'T':
                    occurence[3][i]++;
                    break;
                default:
                    break;
            }
        }
        int[][] rollingSum = new int[4][s.length() + 1];
        for (int k = 1; k < s.length() + 1; k++) {
            for (int j = 0; j < 4; j++) {
                rollingSum[j][k] = rollingSum[j][k - 1] + occurence[j][k - 1];
            }
        }
        int[] results = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int x = P[i];
            int y = Q[i];
            for (int j = 0; j < 4; j++) {
                if (rollingSum[j][y + 1] - rollingSum[j][x] > 0) {
                    results[i] = j + 1;
                    break;
                }
            }
        }
        return results;
    }
}
