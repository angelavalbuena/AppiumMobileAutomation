package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.AttractionLocationScreen;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AttractionsTest extends BaseMobileTest {

	@Description(value = "Successful assertive attractions test ID:0002")
	@Test()
	public void attractionsTest() {
		log.info("Starting successful assertive attractions test");
		SoftAssert softAssertion= new SoftAssert();
		DashBoardScreen dashBoard = dismissTutorial();
		AttractionLocationScreen locationScreen = dashBoard.goToAttractionLocationScreen();
		String categoryTitleText  = locationScreen.getCategoryTitleText();
		String optionHotelesText  = locationScreen.getOptionHotelesText();
		softAssertion.assertEquals(categoryTitleText,"Attractions");
		softAssertion.assertEquals(optionHotelesText,"Hotels");
		softAssertion.assertAll();
	}
}