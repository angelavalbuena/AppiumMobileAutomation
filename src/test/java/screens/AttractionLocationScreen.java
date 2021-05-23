package screens;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;
/**
 * AttractionLocation Screen
 *
 * @author angela.valbuena
 *
 */
public class AttractionLocationScreen extends BaseScreen {

  /**
   * Constructor method.
   *
   * @author angela.valbuena
   *
   * @param driver
   *            : AndroidDriver
   */
  public AttractionLocationScreen(AndroidDriver<AndroidElement> driver) {
    super(driver);
  }

  @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
  private AndroidElement categoryTitle;

  @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
  @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*:id/facilityTypeTitle\").text(\"Hotels\")")
  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Hotels\")")
  private AndroidElement categoryOption;

  public String getCategoryTitleText() {
    return categoryTitle.getText();
  }

  public String getOptionHotelesText() {
    click(categoryTitle);
    return categoryOption.getText();
  }

  @Override
  public void alertControl() {
  }

}
