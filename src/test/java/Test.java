import me.brennan.captcha.ImageGenerator;

import javax.imageio.ImageIO;
import java.io.FileOutputStream;

/**
 * @author Brennan
 * @since 3/24/2021
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        var imageGenerator = new ImageGenerator();
        var captcha = imageGenerator.generateImage();

        System.out.println(captcha.getSolution());

        var fileOutputStream = new FileOutputStream("test.jpg");
        ImageIO.write(captcha.getImage(), "JPG", fileOutputStream);
    }

}
