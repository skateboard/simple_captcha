package me.brennan.captcha;

import me.brennan.captcha.models.Captcha;
import me.brennan.captcha.utils.DrawUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author Brennan
 * @since 3/24/2021
 **/
public class ImageGenerator {
    private static final char[] CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
    private static final Random RANDOM = new Random();

    public Captcha generateImage() {
        var stringBuilder = new StringBuilder();
        var bufferedImage = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
        var graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 68, 22);
        graphics.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));

        int len = CHARACTERS.length, index;

        for (int i = 0; i < 4; i++) {
            index = RANDOM.nextInt(len);

            graphics.setColor(new Color(RANDOM.nextInt(88), RANDOM.nextInt(188), RANDOM.nextInt(255)));

            DrawUtils.drawRotate((Graphics2D) graphics,
                    (i*15)+3, 16,
                    RANDOM.nextBoolean() ? RANDOM.nextInt(50) * (RANDOM .nextBoolean() ? -1 : 1) : RANDOM.nextInt(50),
                    CHARACTERS[index] + "");

            stringBuilder.append(CHARACTERS[index]);
        }

        return new Captcha(bufferedImage, stringBuilder.toString());
    }

}
