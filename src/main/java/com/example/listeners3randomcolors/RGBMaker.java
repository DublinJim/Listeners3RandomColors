package com.example.listeners3randomcolors;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class RGBMaker {


    private final Random random = new Random();
    private ArrayList<Integer> rgb = new ArrayList<>();

    private int red;
    private int green;
    private int blue;

    private float redFloat;
    private float greenFloat;
    private float blueFloat;

    public ArrayList<Integer> getRgb() {
        red = random.nextInt(256) + 1;
        green = random.nextInt(256) + 1;
        blue = random.nextInt(256) + 1;
        rgb.add(red);
        rgb.add(green);
        rgb.add(blue);

        return rgb;
    }

    public Color getColor() {


        double redDouble=random.nextDouble();
        double greenDouble=random.nextDouble();
        double blueDouble =random.nextDouble();


        Color color = new Color(redDouble, greenDouble, blueDouble, .99);


        return color;
    }

}


