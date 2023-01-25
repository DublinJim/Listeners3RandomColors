package com.example.listeners3randomcolors;
import java.util.ArrayList;
import java.util.Random;

public class RGBMaker {


    private Random random = new Random();
    private  ArrayList<Integer> rgb = new ArrayList<>();

  private int red;
  private int green;
  private int blue;

  public ArrayList<Integer> getRgb()
  {
      red=random.nextInt(256)+1;
      green=random.nextInt(256)+1;
      blue=random.nextInt(256)+1;
      rgb.add(red);
      rgb.add(green);
      rgb.add(blue);

      return rgb;
  }




}
