package ui.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.pages.SubscribePage;

/**
 * Created by KAMRUBY on 4/2/2017.
 */
public class SubscribePageTest extends TestHelper{


    @Test
    public void submitSubscription(){
        SubscribePage iSubmitSucribe = PageFactory.initElements(driver,SubscribePage.class);

        iSubmitSucribe.clickOnSubcribeLink();
        iSubmitSucribe.clickonfemaleRadioButton();
        iSubmitSucribe.checkRecieveInformationvViaEmailCheckBox();
        iSubmitSucribe.typeFirstNameField("Kamrul");
        iSubmitSucribe.typeOnlastNameField("Chowdhury");
        iSubmitSucribe.typeOnaddressFiledOne("123 main Street");
        iSubmitSucribe.typeOncityField("");
        iSubmitSucribe.typeOnZipCodeField("11218");
        iSubmitSucribe.selectStateList("New York");
        iSubmitSucribe.selectCountryList("United State");
        iSubmitSucribe.clickOnsubmitButton();

        Assert.assertEquals("Thank you for subscribing. We will sent you email with update. Please stay tuned.",iSubmitSucribe.getAlertText());

    }

    @Test
    public void verifyResetFuncationality(){
        SubscribePage iResetButton = PageFactory.initElements(driver,SubscribePage.class);
        iResetButton.clickOnSubcribeLink();
        iResetButton.clickOnmaleRadioButton();
        iResetButton.checkRecieveInformationvViaEmailCheckBox();
        iResetButton.typeFirstNameField("Kamrul");
        iResetButton.typeOnlastNameField("Chowdhury");
        iResetButton.typeOnaddressFiledOne("123 Main Street");
        iResetButton.typeOnZipCodeField("11218");
        iResetButton.selectStateList("New York");
        iResetButton.selectCountryList("United State");
        iResetButton.clickOnresetButton();
        Assert.assertTrue("Failed - First Name field failed to reset", iResetButton.getNamefieldvalue().equals(""));
    }

    @Test
    public void subscribeFormFiedValidation() {
        SubscribePage subscribePage = PageFactory.initElements(driver, SubscribePage.class);
        subscribePage.submitSubscribeForm("", "David", "New York", "United State");
        Assert.assertEquals("Failed - filed validation error NOT matched", "Please enter all required information.", subscribePage.getAlertText());

        subscribePage.submitSubscribeForm("Smith", "", "New York", "United State");
        Assert.assertEquals("Failed - filed validation error NOT matched", "Please enter your first name", subscribePage.getAlertText());
    }

}
