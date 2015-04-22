/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class BinaryGap {
    public int solution(int N) {
        char binary[] = Integer.toBinaryString(N).toCharArray();
        int max = 0;
        int counter = 0;
        for (int i=0;i<binary.length;i++){

            if (binary[i] == '0'){
                counter++;
            } else if (binary[i] == '1') {
                if (counter>max){
                    max = counter;
                }
                counter = 0;
            }
        }
        return max;
    }
}
