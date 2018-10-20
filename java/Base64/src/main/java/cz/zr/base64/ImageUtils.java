package cz.zr.base64;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtils {

  public static void saveImage(byte[] imageBytes, String fileName) throws IOException {
    try (ByteArrayInputStream stream = new ByteArrayInputStream(imageBytes)) {
      BufferedImage img = ImageIO.read(stream);
      File outputFile = new File(fileName);
      ImageIO.write(img, "jpg", outputFile);
    }
  }

}
