
import java.awt.geom.Line2D;
import java.util.*;

class TurtleCossing {

    public boolean intersectionFound(List<Line2D> segments){


        Line2D last = segments.get(segments.size()-1);

        for (Line2D line:segments){
            if (last.intersectsLine(line)){
                return true;
            }
        }


        return false;
    }

    public int solution(int[] A) {
        int currentMove = 1;
        float previousX = 0.0f;
        float previousY = 0.0f;
        List<Line2D> segments = new ArrayList<>();

        segments.add(new Line2D.Float(previousX,previousY,previousX,previousY+A[0]));
        previousY = previousY+A[0];

        for (int i=1;i<A.length;i++)
        {
            float newX= previousX;
            float newY= previousY;

            if (i % 4 == 0){
                newY+=A[i];
            }
            if (i % 4 == 1){
                newX+=A[i];
            }
            if (i % 4 == 2){
                newY-=A[i];
            }
            if (i % 4 == 3){
                newX-=A[i];
            }

            segments.add(new Line2D.Float(previousX,previousY,newX,newY));
            previousX = newX;
            previousY = newY;

            if (intersectionFound(segments)){
                break;
            }
            currentMove++;
        }

        return currentMove;
    }
}