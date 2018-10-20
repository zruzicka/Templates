package cz.zr.base64;

import java.io.IOException;

/**
 * An example of Base64 decoder.
 */
public class Base64Decoder {

  public byte[] decode(String base64DataWithHeader) throws IOException {
    String imageInBase64 = base64DataWithHeader.split(",")[1];
    return javax.xml.bind.DatatypeConverter.parseBase64Binary(imageInBase64);
  }

}
