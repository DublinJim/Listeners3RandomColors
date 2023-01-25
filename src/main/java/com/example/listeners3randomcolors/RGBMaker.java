package com.example.listeners3randomcolors;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class RGBMaker {


    private final Random random = new Random();
    private final ArrayList<Integer> rgb = new ArrayList<>();

    public ArrayList<Integer> getRgb() {
        int red = random.nextInt(256) + 1;
        int green = random.nextInt(256) + 1;
        int blue = random.nextInt(256) + 1;
        rgb.add(red);
        rgb.add(green);
        rgb.add(blue);

        return rgb;
    }

    public Color getColor() {

        double redDouble = random.nextDouble();
        double greenDouble = random.nextDouble();
        double blueDouble = random.nextDouble();

        return new Color(redDouble, greenDouble, blueDouble, .99);
    }

}


