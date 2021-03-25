package me.brennan.captcha.models;

import java.awt.image.BufferedImage;

/**
 * @author Brennan
 * @since 3/24/2021
 **/
public class Captcha {
    private final BufferedImage image;
    private final String solution;

    public Captcha(BufferedImage image, String solution) {
        this.image = image;
        this.solution = solution;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String getSolution() {
        return solution;
    }
}
