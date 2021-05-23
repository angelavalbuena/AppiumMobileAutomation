package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * AddPlan screen.
 *
 * @author angela.valbuena
 *
 */

public class AddPlanScreen extends BaseScreen {

  /**
   * Constructor method.
   *
   * @author angela.valbuena
   *
   * @param driver
   *            : AndroidDriver
   */
  public AddPlanScreen(AndroidDriver<AndroidElement> driver) {
    super(driver);
  }


  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Reserve Dining\")")
  private AndroidElement reserveDiningOption;

  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Make a Reservation\")")
  private AndroidElement makeReservationOption;


  public String getOptionTitleText() {
    return reserveDiningOption.getText();
  }

  public void goReserveDining(){
    click(reserveDiningOption);
  }

  public String getReservationTitleText() {
    return makeReservationOption.getText();
  }

  @Override
  public void alertControl() {
  }

}
