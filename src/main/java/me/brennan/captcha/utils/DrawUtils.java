package me.brennan.captcha.utils;

import java.awt.*;

/**
 * @author Brennan
 * @since 3/24/2021
 **/
public class DrawUtils {

    public static void drawRotate(Graphics2D g2d, double x, double y, int angle, String text) {
        g2d.translate((float)x,(float)y);
        g2d.rotate(Math.toRadians(angle));
        g2d.drawString(text,0,0);
        g2d.rotate(-Math.toRadians(angle));
        g2d.translate(-(float)x,-(float)y);
    }

}
