package by.HomeWork1_Java2;

import java.awt.*;

public class BackgroundOfCanvas {


    BackgroundOfCanvas(GameCanvas canvas) {

        canvas.setBackground( new Color((int)(Math.random() * 255),
                (int)(Math.random() * 255),
                (int)(Math.random() * 255)));
    }


}
