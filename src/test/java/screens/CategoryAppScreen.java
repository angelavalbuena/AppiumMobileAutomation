package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * CategoryApp Screen
 *
 * @author angela.valbuena
 *
 */
public class CategoryAppScreen extends BaseScreen {

  /**
   * Constructor method.
   *
   * @author angela.valbuena
   *
   * @param driver
   *            : AndroidDriver
   */

  public CategoryAppScreen(AndroidDriver<AndroidElement> driver) {
    super(driver);
  }

  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Privacy\")")
  private AndroidElement privacyLegalOption;

  public boolean checkPrivacyAndLegal() {
    scrollDown(2);
    return privacyLegalOption.isDisplayed();
  }

  public PrivacyAndLegalScreen goToPrivacyAndLegalOption() {
    click(privacyLegalOption);
    return new PrivacyAndLegalScreen(driver);
  }

  @Override
  public void alertControl() {
  }

}
