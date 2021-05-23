package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.AddPlanScreen;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AddPlanTest  extends BaseMobileTest {
    @Description(value = "Successful  test ID:0003")
    @Test()
    public void attractionsTest() {
        log.info("Successful add plan test ID:0004");
        SoftAssert softAssertion= new SoftAssert();
        DashBoardScreen dashBoard = dismissTutorial();
        AddPlanScreen addPlanScreen = dashBoard.goToAddPlanScreen();
        String optionReserveDiningText  = addPlanScreen.getOptionTitleText();
        softAssertion.assertEquals(optionReserveDiningText,"Reserve Dining");
        addPlanScreen.goReserveDining();
        String makeReservationText=  addPlanScreen.getReservationTitleText();
        softAssertion.assertEquals(makeReservationText,"Make a Reservation");
        softAssertion.assertAll();
    }
}
