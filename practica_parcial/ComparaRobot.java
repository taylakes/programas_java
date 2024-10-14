import java.util.*;

public class ComparaRobot implements Comparator<Robot>
{
   @Override
   public int compare(Robot r1, Robot r2) {
      return Integer.compare(r2.getPorcentaje(), r1.getPorcentaje());
   }
}
