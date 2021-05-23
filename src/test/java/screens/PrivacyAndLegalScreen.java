package screens;

import static java.lang.String.format;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import util.screens.BaseScreen;

/**
 * PrivacyAndLegal Screen
 *
 * @author angela.valbuena
 *
 */
public class PrivacyAndLegalScreen extends BaseScreen {
  /**
   * Constructor method.
   *
   * @author angela.valbuena
   *
   * @param driver
   *            : AndroidDriver
   */
  public PrivacyAndLegalScreen(AndroidDriver<AndroidElement> driver) {
    super(driver);
  }

  public boolean checkPrivacyAndLegal(String optionText) {
    String automator = "new UiSelector().resourceIdMatches(\".*:id/txt_element\").text(\"%s\")";
    AndroidElement textOnElement = driver
        .findElementByAndroidUIAutomator(format(automator, optionText));
    log.info(textOnElement.getText());
    return textOnElement.isDisplayed();
  }

  @Override
  public void alertControl() {
  }

}