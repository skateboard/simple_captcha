# Simple Captcha
a simple captcha image generator made in Java!

# Example Usage
```java
import me.brennan.captcha.ImageGenerator;

import javax.imageio.ImageIO;
import java.io.FileOutputStream;

public class Test {

    public static void main(String[] args) throws Exception {
        var imageGenerator = new ImageGenerator();
        var captcha = imageGenerator.generateImage();

        System.out.println(captcha.getSolution());

        var fileOutputStream = new FileOutputStream("test.jpg");
        ImageIO.write(captcha.getImage(), "JPG", fileOutputStream);
    }

}
```

# Implementations
[Spring Implementation](https://github.com/skateboard/simple_captcha_spring)
