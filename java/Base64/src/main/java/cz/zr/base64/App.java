package cz.zr.base64;

import java.io.IOException;

import org.apache.log4j.Logger;

public class App {

  private final Logger logger = Logger.getLogger(getClass());

  private final Base64Decoder decoder = new Base64Decoder();

  public static void main(String[] args) throws IOException {
    new App().decodeImageInBase64(Consts.BASE64DATA_WITH_HEADER, Consts.IMAGE_FILE_NAME);
  }

  protected void decodeImageInBase64(String base64DataWithHeader, String fileName) throws IOException {
    byte[] imageBytes = decoder.decode(base64DataWithHeader);
    log("Image decoded.");
    ImageUtils.saveImage(imageBytes, fileName);
    log("Image saved.");
  }

  protected void log(String message) {
    logger.info(message);
  }
}
