package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/2/2017.
 */
public class SubscribePage extends PageHelper {
    private WebDriver driver;

    @FindBy(linkText = "subscribe")
    private WebElement subcribeLink;
    @FindBy(xpath = ".//*[@id='subscribe-form']/fieldset/input[1]")
    private WebElement femaleRadioButton;
    @FindBy(xpath = ".//*[@id='subscribe-form']/fieldset/input[2]")
    private WebElement maleRadioButton;
    @FindBy(xpath = ".//*[@id='subscribe-form']/fieldset/input[3]")
    private WebElement unknownButton;
    @FindBy(xpath = ".//*[@id='subscribe-form']/fieldset/input[4]")
    private WebElement recieveInformationvViaEmailCheckBox;
    @FindBy(id = "first-name")
    private WebElement firstNameField;
    @FindBy(id = "last-name")
    private WebElement lastNameField;
    @FindBy(id = "street-address1")
    private WebElement addressFiledOne;
    @FindBy(xpath = ".//*[@id='subscribe_form']/tbody/tr[5]/td[2]/input")
    private WebElement getAddressFiledTwo;
    @FindBy(id = "city")
    private WebElement cityField;
    @FindBy(id = "zip")
    private WebElement zipCodeField;
    @FindBy(id = "state")
    private WebElement stateList;
    @FindBy(id = "country")
    private WebElement countryList;
    @FindBy(xpath = ".//*[@id='submit-btn']")
    private WebElement submitButton;
    @FindBy(id = "reset-btn")
    private WebElement resetButton;


    public SubscribePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnSubcribeLink() {
        subcribeLink.click();
    }

    public void clickonfemaleRadioButton() {
        femaleRadioButton.click();
    }

    public void clickOnmaleRadioButton() {
        maleRadioButton.click();
    }

    public void clickOnunknownButton() {
        unknownButton.click();
    }

    public void checkRecieveInformationvViaEmailCheckBox() {
        if (!recieveInformationvViaEmailCheckBox.isSelected()) {
            recieveInformationvViaEmailCheckBox.click();
        }
    }

    public void typeFirstNameField(String fName) {
        firstNameField.sendKeys(fName);
    }

    public void typeOnlastNameField(String lName) {
        lastNameField.sendKeys(lName);
    }

    public void typeOnaddressFiledOne(String addOne) {
        addressFiledOne.sendKeys(addOne);
    }

    public void typeOngetAddressFiledTwo(String addTwo) {
        getAddressFiledTwo.sendKeys(addTwo);
    }

    public void typeOncityField(String city) {
        cityField.sendKeys(city);
    }

    public void typeOnZipCodeField(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

    public void selectStateList(String stateName) {
        Select dropdown = new Select(stateList);
        dropdown.selectByVisibleText(stateName);

    }

    public void selectCountryList(String countryName) {
        Select dropdown = new Select(countryList);
        dropdown.selectByVisibleText(countryName);
    }

    public void clickOnsubmitButton() {
        driverWaitUntil(submitButton, 120);
        submitButton.click();
    }

    public void clickOnresetButton() {
        resetButton.click();
    }

    public String getNamefieldvalue() {
        return driver.findElement(By.id("first-name")).getAttribute("value");
    }

    public void submitSubscribeForm(String firstName, String lastName, String stateName, String countryName) {
        clickOnSubcribeLink();
        clickonfemaleRadioButton();
        checkRecieveInformationvViaEmailCheckBox();
        typeFirstNameField(firstName);
        typeOnlastNameField(lastName);
        typeOnaddressFiledOne("100 Main Street");
        typeOngetAddressFiledTwo("Suite 100");
        typeOncityField("Brooklyn");
        typeOnZipCodeField("11218");
        selectStateList(stateName);
        selectCountryList(countryName);
        clickOnsubmitButton();
        acceptAlert();
    }


}




