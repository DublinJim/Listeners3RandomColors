import java.util.ArrayList;
import java.util.Random;

public class RGBMaker {


    private Random random = new Random();
    private  ArrayList<Integer> rgb = new ArrayList<>();

  private int red = random.nextInt();
  private int green= random.nextInt();
  private int blue= random.nextInt();

  public ArrayList<Integer> getRgb()
  {
      rgb.add(red);
      rgb.add(green);
      rgb.add(blue);

      return rgb;
  }




}
