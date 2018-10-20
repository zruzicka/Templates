package cz.zr.base64;

import java.io.File;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

  public AppTest(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /** */
  public void testLog() {
    new App().log("Test log message.");
  }

  /**
   * @throws IOException
   */
  public void testDecodeImageInBase64() throws IOException {
    String fileName = Consts.IMAGE_FILE_NAME;
    new App().decodeImageInBase64(Consts.BASE64DATA_WITH_HEADER, fileName);
    assertTrue("Created file expected.", new File(fileName).exists());
  }

}
