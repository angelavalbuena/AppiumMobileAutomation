package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.CategoryAppScreen;
import screens.DashBoardScreen;
import screens.PrivacyAndLegalScreen;
import util.tests.BaseMobileTest;

public class CategoryAppTest extends BaseMobileTest {

  @Description(value = "Successful assertive privacy & legal test ID:0003")
  @Test()
  public void categoryTest() {
    log.info("Starting successful assertive privacy & legal test");
    SoftAssert softAssertion = new SoftAssert();
    DashBoardScreen dashBoard = dismissTutorial();
    CategoryAppScreen categoryAppScreen = dashBoard.goToCategoryAppScreen();
    boolean privacyLegalOption = categoryAppScreen.checkPrivacyAndLegal();
    PrivacyAndLegalScreen privacyAndLegalScreen = categoryAppScreen.goToPrivacyAndLegalOption();
    boolean privacyPolicy = privacyAndLegalScreen.checkPrivacyAndLegal("Privacy Policy");
    boolean termsOfUse = privacyAndLegalScreen.checkPrivacyAndLegal("Terms of Use");
    boolean supplementalTermsAndConditions = privacyAndLegalScreen.checkPrivacyAndLegal("Supplemental Terms and Conditions");
    boolean legalNotices = privacyAndLegalScreen.checkPrivacyAndLegal("Legal Notices");
    boolean propertyRules = privacyAndLegalScreen.checkPrivacyAndLegal("Property Rules");
    boolean electronicCommunicationsDisclosure = privacyAndLegalScreen.checkPrivacyAndLegal("Electronic Communications Disclosure");
    softAssertion.assertTrue(privacyLegalOption, "Privacy & Legal not found");
    softAssertion.assertTrue(privacyPolicy, "Privacy Policy not found");
    softAssertion.assertTrue(termsOfUse, "Terms of Use not found");
    softAssertion.assertTrue(supplementalTermsAndConditions, "Supplemental Terms and Conditions not found");
    softAssertion.assertTrue(legalNotices, "Legal Notices not found");
    softAssertion.assertTrue(propertyRules, "Property Rules not found");
    softAssertion.assertTrue(electronicCommunicationsDisclosure, "Electronic Communications Disclosure not found");
    softAssertion.assertAll();
  }
}