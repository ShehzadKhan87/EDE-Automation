package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;
import webelements.OR;

public class CommonMethodPage extends BasePage {
	
	public void clickSignBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.sh_signIn, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "sh_signIn");
	}

	public void clickContinueBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.continueBtn, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue button");
	}

	public void selectState(String state) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBePresent(OR.selectState, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectState, getWebDriver());
		Wait.wait5Second();
		
		Select select = new Select(element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectStateAgent(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateAgent, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectStateAgent, getWebDriver());
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void clickApplyOrRenew() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickApplyOrRenew, 60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "apply or renew button");
	}

	public void clickApplyOrRenewAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickApplyOrRenewAgent, 60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "apply or renew button");
	}

	public void clickNext() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickNext, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickNext, getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "next button");
	}

	public void clickIAgreeCheckBox() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.iAgreeCheckBox, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.iAgreeCheckBox, getWebDriver());
		clickElement(element,
				" I agree to have my information used and retrieved from data sources for this application. I have consent for all people I'll list on the application for their information to be retrieved and used from data sources.");
	}

	public void clickIAllowCheckBox() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.iAllowCheckBox, 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element,
				"I allow Jet Health Solutions to access my application to help me apply for health coverage.");
	}

	public void clickIUnderstandCheckBox() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.iUnderstandCheckBox, 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element,
				"I understand that I’m required to provide true answers and that I may be asked to provide additional information, including proof of my eligibility for a Special Enrollment Period, if I qualify. If I don’t, I may face penalties, including the risk of losing my eligibility for coverage.");
	}

	public void clickSaveAndContinueButton() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, "save and continue button");
	}

	public void clickContinueAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueAgent, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueAgent, getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, "continue button");
	}

	public void needCoverage(String decision, String personCount) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span[contains(text(),'" + decision + "')])[" + personCount + "]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qulifying health coverage Recent");
		} catch (Exception e) {
			getWebDriver().navigate().refresh();
			Wait.wait5Second();
			clickElement(element, decision + " for lose qulifying health coverage Recent");
		}
	}

	public void selectGender(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		element.click();
		clickElement(element, "on " + decision + " for gender");
	}

	public String enterDob(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDOB, 60);
		String dob = ESTTimeZone.getDobFromAge(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}

	public String enterDobLow(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDOB, 60);
		String dob = ESTTimeZone.getDobFromAgeLow(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}

	public void enterFirstNameAgent(String firstName) {
		WebElement element = waitForElementToBePresent(OR.enterFirstNameAgent, 60);
		sendKeysToElement(element, firstName, " first name");
	}

	public void enterFirstName(String firstName) {
		WebElement element = waitForElementToBePresent(OR.enterFirstName, 60);
		sendKeysToElement(element, firstName, " first name");
	}

	public void enterMiddleName(String middleName) {
		WebElement element = waitForElementToBePresent(OR.enterMiddleName, 60);
		sendKeysToElement(element, middleName, " middle name");
	}

	public void enterLastNameAgent(String lastName) {
		WebElement element = waitForElementToBePresent(OR.enterLastNameAgent, 60);
		sendKeysToElement(element, lastName, " last name");
	}

	public void enterLastName(String lastName) {
		WebElement element = waitForElementToBePresent(OR.enterLastName, 60);
		sendKeysToElement(element, lastName, " last name");
	}

	public void enterStreetAddress(String streetAddress) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterStreetAddress, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, streetAddress, " street address");
	}

	public void selectStateInContactInfo(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateInContactInfo, 60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectStateInContactInfoOnSamePage(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateInContactInfoOnSamePage, 60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void enterCity(String city) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterCity, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, city, " city");
	}

	public void enterOtherRace(String race) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterOtherRace, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, race, " race");
	}

	public void enterZipCode(String zipCode) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterZipCode, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, "25456", " zipCode");
		Wait.wait2Second();
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
		sendKeysToElement(element, zipCode, "zip code");
		element.sendKeys(Keys.TAB);
		Wait.wait5Second();
	}

	public void enterZipCode2OnSamePage(String zipCode) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterZipCode2OnSamePage, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, "25456", " zipCode");
		Wait.wait2Second();
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
		sendKeysToElement(element, zipCode, "zip code");
		element.sendKeys(Keys.TAB);
		Wait.wait5Second();
	}

	public void selectAddress() throws InterruptedException {
		try {
			// select address
			WebElement element = waitForElementToBeClickable(OR.addressRadiobtn, 60);
			Wait.waitForElement(getWebDriver(), element);
			clickElement(element, "address radio button");

			// click Continue
			WebElement elementContinue = waitForElementToBeClickable(OR.continueAddressBtn, 60);
			Wait.waitForElement(getWebDriver(), elementContinue);
			Utility.attachWebScreenShotToReport(
					ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			clickElement(elementContinue, "continue button");
		} catch (Exception e) {
		}
	}

	public void selectMailingAddress(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for mailing address");
	}

	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumber, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
		element.sendKeys(Keys.TAB);
	}

	public void enterPhoneNumberJobB(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumberJobB, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
	}

	public void enterPhoneNumber2(String phoneNumber) throws InterruptedException {
		By path = By.xpath("(//span[contains(text(),'Phone number')]/../..//following-sibling::div//input)[2]");
		WebElement element = waitForElementToBePresent(path, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
	}

	public void enterPhoneNumber3(String phoneNumber) throws InterruptedException {
		By path = By.xpath("(//span[contains(text(),'Phone number')]/../..//following-sibling::div//input)[3]");
		WebElement element = waitForElementToBePresent(path, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
	}

	public void selectPhoneType(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		clickElement(element, "on " + decision + " for phone type");
	}

	public void selectWrittenLanguage(String language) throws Exception {
		WebElement element = waitForElementToBePresent(OR.selectWrittenLanguage, 60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(language);
		ExtentTestManager.getTest().info("Written language selected: " + language);
	}

	public void selectSpokenLanguage(String language) throws Exception {
		WebElement element = waitForElementToBePresent(OR.selectSpokenLanguage, 60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(language);
		ExtentTestManager.getTest().info("Spoken language selected: " + language);
	}

	public void selectNoticeMedium(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for notice medium");
	}

	public void selectIsProfessnalHelping(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for professional helping");
	}

	public void selectHelpPayingForCoverage(String decision) throws InterruptedException {
		Wait.wait2Second();
		if (decision.equals("Yes")) {
			String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
			WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
			Wait.waitForElement(getWebDriver(), element);
			Wait.waitUntilPageIsLoaded(getWebDriver());
			Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
			Wait.wait2Second();
			clickElement(element, "on " + decision + " for seeking coverage");
		} else if (decision.equals("No")) {
			String path = "//span//span[contains(text(),'" + decision + "')]";
			WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
			Wait.waitForElement(getWebDriver(), element);
			Wait.waitUntilPageIsLoaded(getWebDriver());
			Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
			Wait.wait2Second();
			clickElement(element, "on " + decision + " for seeking coverage");

		}
		/*
		 * String path = "//span//span[contains(text(),'" + decision + "')]"; WebElement
		 * element = waitForElementToBeClickable(By.xpath(path), 60);
		 * Wait.waitForElement(getWebDriver(), element);
		 * Wait.waitUntilPageIsLoaded(getWebDriver());
		 * Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		 * Wait.wait2Second(); clickElement(element, "on " + decision +
		 * " for seeking coverage");
		 */
	}

	public void clickAddPerson() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickAddPerson, 60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " add a person");
	}

	public void clickWithOutSSN() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.withOutSSN, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.withOutSSN, getWebDriver());
		clickElement(element, " with out SSN");
	}

	public void clickContinueWithoutSsnBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.continueWithoutSsnButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue button");
	}

	public void enterSSN(String ssn, String sameNameQuestion) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterSSN, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, ssn, " SSN number");
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
		String question = getS012SameNameQuestion();
		ExtentTestManager.getTest().info("Expected: " + sameNameQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, sameNameQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S012");
	}

	public void selectWithSameName(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for same name");
	}

	public void selectUSCitizenOrNot(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for US Citizen");
	}

	public String getS017DocumentQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s017 document question");
		return question;
	}

	public String getS017DocumentDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 document drawer heading");
		return heading;
	}

	public String getS017DocumentDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 drawer content");
		return content;
	}

	public void clickS017DocumentOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017DocumentOpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s017 document drawer");
	}

	public void selectNaturalizedOrDrived(String decision, String expectedDocumentQuestion, String drawerHeading,
			String drawerContent) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath("//span[contains(text(),'" + decision + "')]"), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for naturalized or drived");
		Wait.wait2Second();
		if (decision.equals("Yes")) {
			String questionFound = getS017DocumentQuestion();
			String question = questionFound.replace("\n", " ");
			ExtentTestManager.getTest().info("Expected: " + expectedDocumentQuestion);
			ExtentTestManager.getTest().info("Found: " + question);
			Assert.assertEquals(question, expectedDocumentQuestion, "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on document drawer S017");

//			clickS017DocumentOpenDrawerLink();
//			clickS017DocumentOpenDrawerLink();
//
//			String actualDrawerHeading = getS017DocumentDrawerHeading();
//			ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//			Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on document drawer S017");
//
//			String drawerContentFound = getS017DocumentDrawerContent();
//			String actualDrawerContent = drawerContentFound.replace("\n", "");
//			ExtentTestManager.getTest().info("Expected: " + drawerContent);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//			Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on document drawer S017");

		} else {

		}

	}

	public String getS017DocumentSubQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s017 document sub question");
		return question;
	}

	public String getS017DocumentSubDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 sub document drawer heading");
		return heading;
	}

	public String getS017DocumentSubDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 sub drawer content");
		return content;
	}

	public void clicks017DocumentSubOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017DocumentSubOpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s017 sub document drawer");
	}

	public void selectDocumentType(String decision, String expectedDocumentQuestion, String drawerHeading,
			String drawerContent) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label//parent::div"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for document");

		if (decision.equals("Naturalization certificate") || decision.equals("Certificate of citizenship")) {
			String questionFound = getS017DocumentSubQuestion();
			String question = questionFound.replace("\n", " ");
			ExtentTestManager.getTest().info("Expected: " + expectedDocumentQuestion);
			ExtentTestManager.getTest().info("Found: " + question);
			Assert.assertEquals(question, expectedDocumentQuestion, "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on document drawer S017");

//			clicks017DocumentSubOpenDrawerLink();
//			clicks017DocumentSubOpenDrawerLink();
//
//			String actualDrawerHeading = getS017DocumentSubDrawerHeading();
//			ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//			Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on document drawer S017");
//
//			String drawerContentFound = getS017DocumentSubDrawerContent();
//			String actualDrawerContent = drawerContentFound.replace("\n", "");
//			ExtentTestManager.getTest().info("Expected: " + drawerContent);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//			Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on document drawer S017");

		} else {

		}
	}

	public void enterAlienNumber(String alienNumber) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.enterAlienNumber, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Alien Number");
	}

	public void enterNaturalizedNumber(String alienNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterNaturalizeNumber, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Naturalize Number");
	}

	public void clickSaveAndContinueScrolled() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 90);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "next button");
	}

	public void selectSitutionHouseHold_S050A(String situation) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span[contains(text(),'" + situation + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, situation + " for situation in house hold");
	}

	public void haveICHRAandQSEHRA_S069D(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for ICHRA and QSEHRA");
	}

	public void loseQualifyingHealthCovRecent_S083(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		WebElement element = getWebDriver().findElement(By.xpath(path));
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qulifying health coverage Recent");
		} catch (Exception e) {
			Wait.wait5Second();
			clickElement(element, decision + " for lose qulifying health coverage Recent");
		}
	}

	public void loseQulifyingHealthCovUpcoming_S084(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for lose qulifying health coverage Upcoming");
	}

	public void recentChanges_S085(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
	}

	public void agreeOne() throws InterruptedException {
		Wait.wait5Second();
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeOne, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeOne, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeTwo() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.agreeTwo, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeTwo, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeTwoNew() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.agreeTwoNew, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeTwoNew, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeThree() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.agreeThree, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeThree, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeFour() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.agreeFour, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeFour, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void enterSignature(String signature) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.signature, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, signature, "Signature field");
	}

	public void selectCounty(String county) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//option[contains(text(),'" + county + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county");
	}

	public void selectCountyOnSamePage(String county) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//option[contains(text(),'" + county + "')])[2]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county");
	}

	public void clickCountyDropDown() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.county, 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county drop down");
	}

	public void clickCountyDropDownOnSamePage() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.countyOnSamePage, 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county drop down");
	}

	public void downloadEligibilityReport() throws InterruptedException {
		Wait.wait10Second();
		WebElement element = waitForElementToBeClickable(OR.eligibilityNoticeButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(OR.eligibilityNoticeButton, getWebDriver());
		Wait.wait15Second();
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.wait10Second();
		clickElement(element, " download eligibility notice");
		Wait.wait2Second();
//		String currentTab = getWebDriver().getWindowHandle();
//		ArrayList<String> tabs2 = new ArrayList<String>(getWebDriver().getWindowHandles());
//		for (String handles : tabs2) {
//			if (!currentTab.equalsIgnoreCase(handles)) {
//				getWebDriver().switchTo().window(tabs2.get(1));
//				getWebDriver().close();
//			}
//			getWebDriver().switchTo().window(tabs2.get(0));
//		}
		Wait.wait5Second();
	}

	public void clickOpenMailingDrawer_S003() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.mailingDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of mailing drawer");
	}

	public String getMailingDrawerHeadingText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.mailingDrawerHeader, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "mailing drawer heading");
		return heading;
	}

	public String getS003Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getS003Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getDrawerLinkText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.mailingDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		String link = getElementText(element, "mailing drawer link");
		return link;
	}

	public String getMailingDrawerContentText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "mailing drawer content");
		return content;
	}

	public void verifyScreen_s003(String mailingLink, String mailingDrawerHeading, String s003Question,
			String drawerContent) throws InterruptedException {

		// Verifying Question: Is this also your mailing address?
		String question = getS003Question();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + s003Question);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], s003Question, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S003");

//		// Verifying Link Text: Learn how mailing address affects coverage.
//		String linkText = getDrawerLinkText();
//		ExtentTestManager.getTest().info("Expected: " + mailingLink);
//		ExtentTestManager.getTest().info("Found: " + linkText);
//		Assert.assertEquals(linkText, mailingLink, "Failed to verify: " + linkText);
//		ExtentTestManager.getTest().info("Verified: " + linkText + " on S003");
//
//		clickOpenMailingDrawer_S003();
//
//		// Verifying mail address Drawer Heading: Learn how mailing address affects
//		// coverage
//		String heading = getMailingDrawerHeadingText();
//		ExtentTestManager.getTest().info("Expected: " + mailingDrawerHeading);
//		ExtentTestManager.getTest().info("Found: " + heading);
//		Assert.assertEquals(heading, mailingDrawerHeading, "Failed to verify: " + heading);
//		ExtentTestManager.getTest().info("Verified: " + heading + " on S003");
//
//		String drawerContentFound = getMailingDrawerContentText();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S003");
	}

	public void verifyScreen_s003_question2(String s003Question) throws InterruptedException {

		// Verifying Question: Is this also your mailing address?
		String question = getS003Question2();
		ExtentTestManager.getTest().info("Expected: " + s003Question);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, s003Question, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S003");
	}

	public String getS001Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s001Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s001 question");
		return question;
	}

	public void verifyS001(String expectedQuestion) throws InterruptedException {
		String question = getS001Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S001");
	}

	public String getS002Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s002Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s002 question");
		return question;
	}

	public void verifyS002(String expectedQuestion) throws InterruptedException {
		String question = getS002Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S002");
	}

	public String getS004Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s004Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s004 question");
		return question;
	}

	public void verifyS004(String expectedQuestion) throws InterruptedException {
		String question = getS004Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S004");
	}

	public String getS005Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s005 question");
		return question;
	}

	public String gets005QuestionExplaination() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005QuestionExplaination, 60);
		Wait.waitForElement(getWebDriver(), element);
		String explaination = getElementText(element, "s005 question Explaination");
		return explaination;
	}

	public void clickS005OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s005OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s005 drawer");
	}

	public String getS005DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s005 drawer heading");
		return heading;
	}

	public String getS005DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s005 drawer Content");
		return content;
	}

	public void verifyS005(String expectedQuestion, String expectedExplaination, String drawerHeading,
			String drawerContent) throws InterruptedException {
		String question = getS005Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S005");

//		String getExplaination = gets005QuestionExplaination();
//		String explaination = getExplaination.replace("\n", " ");
//		ExtentTestManager.getTest().info("Expected: " + expectedExplaination);
//		ExtentTestManager.getTest().info("Found: " + explaination);
//		Assert.assertEquals(explaination, expectedExplaination, "Failed to verify: " + explaination);
//		ExtentTestManager.getTest().info("Verified: " + explaination + " on S005");
//
//		clickS005OpenDrawer();
//
//		String actualDrawerHeading = getS005DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S005");
//
//		String drawerContentFound = getS005DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S005");

	}

	public String getS006Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s006Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s006 question");
		return question;
	}

	public void verifyS006(String expectedQuestion) throws InterruptedException {
		String question = getS006Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S006");
	}

	public String getS007Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s007 question");
		return question;
	}

	public void clickS007OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s007OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s007 drawer");
	}

	public String getS007DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s007 drawer heading");
		return heading;
	}

	public String getS007DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s007 drawer content");
		return content;
	}

	public void verifyS007(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String getQuestion = getS007Question();
		String question = getQuestion.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S007");

//		clickS007OpenDrawer();
//
//		String actualDrawerHeading = getS007DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S007");
//
//		String drawerContentFound = getS007DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S007");
	}

	public String getS008Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s008Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s008Question, getWebDriver());
		String question = getElementText(element, "s008 question");
		return question;
	}

	public void verifyS008(String expectedQuestion) throws InterruptedException {
		String question = getS008Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S008");
	}

	public void clickS010MedicaidOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010MedicareDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 medicaid drawer");
	}

	public void clickS010NotToIncludeOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010NotIncludeDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 Not include drawer");
	}

	public void clickS010RemoveSomeOneOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010EditOrRemoveDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 remove someone drawer");
	}

	public String getS010MedicaidDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010MedicareDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 medicaid drawer heading");
		return heading;
	}

	public String getS010NotIncludeDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010NotIncludeDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 not include drawer heading");
		return heading;
	}

	public String getS010RemoveSomeOneDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010EditOrRemoveDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 remove someone drawer heading");
		return heading;
	}

	public String getS010MedicaidDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010MedicareDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 medicaid drawer content");
		return heading;
	}

	public String getS010NotIncludeDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010NotIncludeDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 not include drawer content");
		return heading;
	}

	public String getS010RemoveSomeOneDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010EditOrRemoveDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 remove someone drawer content");
		return heading;
	}

	public String getS010AppId() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.appID, 60);
		Wait.waitForElement(getWebDriver(), element);
		String id = getElementText(element, "Application Id");
		String[] idFound = id.split(" ");
		return idFound[2].trim();
	}

	public void verifyS010(String expectedMedicaidDrawerHeading, String expectedNotIncludeDrawerHeading,
			String expectedRemoveSomeOneDrawerHeading, String medicaidDrawerContent, String notIncludeDrawerContent,
			String RemoveSomeOneDrawerContent) throws InterruptedException {
		clickS010MedicaidOpenDrawer();
		String actualMedicaidDrawerHeading = getS010MedicaidDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedMedicaidDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualMedicaidDrawerHeading);
		Assert.assertEquals(actualMedicaidDrawerHeading, expectedMedicaidDrawerHeading,
				"Failed to verify: " + actualMedicaidDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualMedicaidDrawerHeading + " on S010");

		String drawerContentFound = getS010MedicaidDrawerContent();
		String actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + medicaidDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, medicaidDrawerContent, "Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010");
		clickS010MedicaidOpenDrawer();

		clickS010NotToIncludeOpenDrawer();
		String actualNotIncludeDrawerHeading = getS010NotIncludeDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedNotIncludeDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualNotIncludeDrawerHeading);
		Assert.assertEquals(actualNotIncludeDrawerHeading, expectedNotIncludeDrawerHeading,
				"Failed to verify: " + actualNotIncludeDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualNotIncludeDrawerHeading + " on S010");

		drawerContentFound = getS010NotIncludeDrawerContent();
		actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + notIncludeDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, notIncludeDrawerContent, "Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010");

		clickS010NotToIncludeOpenDrawer();

		clickS010RemoveSomeOneOpenDrawer();
		String actualRemoveSomeOneDrawerHeading = getS010RemoveSomeOneDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedRemoveSomeOneDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualRemoveSomeOneDrawerHeading);
		Assert.assertEquals(actualRemoveSomeOneDrawerHeading, expectedRemoveSomeOneDrawerHeading,
				"Failed to verify: " + actualRemoveSomeOneDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualRemoveSomeOneDrawerHeading + " on S010");

		drawerContentFound = getS010RemoveSomeOneDrawerContent();
		actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + RemoveSomeOneDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, RemoveSomeOneDrawerContent,
				"Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S007");
		clickS010RemoveSomeOneOpenDrawer();

		String appId = getS010AppId();
		System.out.println(appId);
		ExtentTestManager.getTest().info(appId);
	}

	public String getS012Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.so12Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s012 question");
		return question;
	}

	public String getS012SameNameQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s012SameNameQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s012 same name question");
		return question;
	}

	public void verifyS012(String expectedQuestion) throws InterruptedException {
		String question = getS012Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S012");
	}

	public void verifyS012Optional(String expectedQuestion) throws InterruptedException {
		String questionFound = getS012Question();
		String[] question = questionFound.split("");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S012");
	}

	public String getS014Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s014 question");
		return question;
	}

	public void clickS014OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s014OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s014 drawer");
	}

	public String getS014DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s014 heading");
		return heading;
	}

	public String getS014DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s014 drawer content");
		return content;
	}

	public void verifyS014(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String question = getS014Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S014");

//		clickS014OpenDrawer();
//
//		String actualDrawerHeading = getS014DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S014");
//
//		String drawerContentFound = getS014DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S014");
	}

	public String getS017Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s017Question, getWebDriver());
		String question = getElementText(element, "s017 question");
		return question;
	}

	public void clickS017OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 medicaid drawer");
	}

	public String getS017DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 heading");
		return heading;
	}

	public String getS017DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 drawer content");
		return content;
	}

	public void verifyS017(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String question = getS017Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S017");

//		clickS017OpenDrawerLink();
//
//		String actualDrawerHeading = getS017DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S017");
//
//		String drawerContentFound = getS017DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S017");
	}

	public String getS050AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s050AQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s050A question");
		return question;
	}

	public void verifyS050A(String expectedQuestion) throws InterruptedException {
		String question = getS050AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S050A");
	}

	public String getS069DQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069DQuestion, getWebDriver());
		String question = getElementText(element, "s069D question");
		return question;
	}

	public String getS069DDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s069D heading");
		return heading;
	}

	public String getS069DDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s069D drawer content");
		return content;
	}

	public void verifyS069D(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		Wait.wait2Second();
		String questionFound = getS069DQuestion();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S069D");

//		clickS069DOpenDrawerLink();
//
//		String actualDrawerHeading = getS069DDrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S069D");
//
	}

	public String getS083Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s083Question, getWebDriver());
		String question = getElementText(element, "s083 question");
		return question;
	}

	public void clickS083OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s083OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s083 drawer");
	}

	public String getS083DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s083 drawer heading");
		return heading;
	}

	public String getS083DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s083 drawer content");
		return content;
	}

	public void verifyS083(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		Wait.wait5Second();
		String question = getS083Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S083");

//		clickS083OpenDrawerLink();
//
//		String actualDrawerHeading = getS083DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S083");
//
//		String drawerContentFound = getS083DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S083");
	}

	public String getS085Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s085Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s085 question");
		return question;
	}

	public void verifyS085(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String questionFound = getS085Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S085");
	}

	public String getS084Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s084Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s084 question");
		return question;
	}

	public void clickS084OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s084OpenDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s084 drawer");
	}

	public String getS084DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s084DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s084 drawer heading");
		return heading;
	}

	public void verifyS084(String expectedQuestion, String drawerHeading) throws InterruptedException {
		Wait.wait5Second();
		String question = getS084Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S084");

//		clickS084OpenDrawerLink();
//
//		String actualDrawerHeading = getS084DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S083");
	}

	public void clickReviewOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.reviewDrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of review drawer");
	}

	public String getReviewDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.reviewDrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "review drawer heading");
		return heading;
	}

	public String getReviewDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.reviewDrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s083 drawer content");
		return content;
	}

	public void verifyReviewScreen(String drawerHeading, String drawerContent) throws InterruptedException {
		Wait.wait5Second();
//		clickReviewOpenDrawerLink();
//
//		String actualDrawerHeading = getReviewDrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on review");
//
//		String drawerContentFound = getReviewDrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on review screen");
	}

	public void selectRelation_RelationShip(String relation, String secondRelation, String thirdRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}

	}

	public void selectRelation1_L_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation3G_S27_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation1_O_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String fifthRelation, String sixthRelation, String seventhRelation,
			String eighthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
		if (count.contains("7")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[7]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);
		}
		if (count.contains("8")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[7]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[8]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(eighthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + eighthRelation);
		}
	}

	public void selectRelation(String relation, String secondRelation, String thirdRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}

	}

	public void selectRelation1_L(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation3G_S27(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation1_O(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String fifthRelation, String sixthRelation, String seventhRelation, String eighthRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
		if (count.contains("7")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[7]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);
		}
		if (count.contains("8")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[7]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[8]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(eighthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + eighthRelation);
		}
	}

	public void selectRelation3H_S038(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String fifthRelation, String sixthRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
	}

	public void selectToRemovePerson(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for remove person");
	}

	public String getS010AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010AQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s010A question");
		return question;
	}

	public void clickS010ADrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010ADrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010A drawer");
	}

	public String getS010ADrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010ADrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010A drawer heading");
		return heading;
	}

	public String getS010ADrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010ADrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s010A drawer content");
		return content;
	}

	public void verifyS010A(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String question = getS010AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S010A");

//		clickS010ADrawerLink();
//
//		String actualDrawerHeading = getS010ADrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S010A");
//
//		String drawerContentFound = getS010ADrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010A");
	}

	public void selectMaritalStatus(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for marital status");
	}

	public String getS026Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s026 question");
		return question;
	}

	public void clickS026DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s026DrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s026 drawer");
	}

	public String getS026DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s026 drawer heading");
		return heading;
	}

	public String getS026DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s026 drawer content");
		return content;
	}

	public void verifyS026(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String question = getS026Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s026");

//		clickS026DrawerLink();
//
//		String actualDrawerHeading = getS026DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s026");
//
//		String drawerContentFound = getS026DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s026");
	}

	public void selectIsFilingTax(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for filling jointly");
	}

	public void selectIsFilingTaxMarriedNotFillingJointlyQuestion2_S027(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for filling jointly");
	}

	public void selectIsAnyDependent(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " for is there any dependent");
	}

	public void selectIsAnyDependentMarriedButFillingSeprate_027(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " for is there any dependent");
	}

	public void areYouHeadOfHouseHold_027_4thIndex(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[5]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " live on this address");
	}

	public void doesApplicantAndSpouseLiveTogather_027(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[4]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " applicant and spouse live togather");
	}

	public void doesApplicantFileAsHouseHold_027(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[5]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " applicant filling tax as house hold");
	}

	public void selectDependent(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for dependent");
	}

	public void doYouClaimDependent_S027_3rdIndex(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for dependent");
	}

	public String getS027Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public String getS027QuestionSingle2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionSingle2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public void verifyS027Single2(String expectedQuestion) throws InterruptedException {
		Wait.wait5Second();
		String question = getS027QuestionSingle2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s027");
	}

	public void clickS027DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s027DrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s027 drawer");
	}

	public String getS027DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s027 drawer heading");
		return heading;
	}

	public String getS027DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s027 drawer content");
		return content;
	}

	public void verifyS027(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		Wait.wait5Second();
		String questionFound = getS027Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027");

//		clickS027DrawerLink();
//
//		String actualDrawerHeading = getS027DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s027");
//
//		String drawerContentFound = getS027DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s027");
//		clickS027DrawerLink();
	}

	public String getS027QuestionDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionDependent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 Dependent question");
		return question;
	}

	public void clickS027DrawerLinkDependent() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s027DrawerLinkDependent, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s027 Dependent drawer");
	}

	public String getS027DrawerHeadingDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerHeadingDependent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s027 Dependent drawer heading");
		return heading;
	}

	public String getS027DrawerContentDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerContentDependent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s027 Dependent drawer content");
		return content;
	}

	public void verifyS027Dependent(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS027QuestionDependent();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027 Dependent");

//		clickS027DrawerLinkDependent();
//
//		String actualDrawerHeading = getS027DrawerHeadingDependent();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s027 Dependent");
//
//		String drawerContentFound = getS027DrawerContentDependent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s027 Dependent");
	}

	public String getS027QuestionDependent3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionDependent3, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 Dependent question");
		return question;
	}

	public void verifyS027Dependent3(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS027QuestionDependent3();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027 Dependent");
	}

	public void selectDoTheyLiveTogather(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " living togather");
	}

	public String getS041AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041AQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s041A question");
		return question;
	}

	public void clickS041ADrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s041ADrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s041A drawer");
	}

	public String getS041ADrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041ADrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s041A drawer heading");
		return heading;
	}

	public String getS041ADrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041ADrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s041A drawer content");
		return content;
	}

	public void verifyS041A(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		Wait.wait5Second();
		String questionFound = getS041AQuestion();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s041A");

//		clickS041ADrawerLink();
//
//		String actualDrawerHeading = getS041ADrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s041A");
//
//		String drawerContentFound = getS041ADrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s041A");
	}

	public String getS041AQuestion2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041AQuestion2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s041A question2");
		return question;
	}

	public void verifyS041AQuestion2(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS041AQuestion2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s041A");
	}

	public void applicantTakeCareOfChildrenFirst_S038(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, decision + " for recent changes");
	}

	public void applicantTakeCareOfChildrenOther_S038(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, decision + " for recent changes");
	}

	public void applicantTakeCareOfChildren_S038Question2(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
	}

	public void applicantMainPersonTakeCareOfChildren_S038Question3(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
	}

	public String getS038Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s038Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s038 question");
		return question;
	}

	public void verifyS038(String expectedQuestion) throws InterruptedException {
		String question = getS038Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S038");
	}

	public void foundNotEligibleMedicaidOrCHIP_S046(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public String getS046Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s046 question");
		return question;
	}

	public void clickS046DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s046DrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s046 drawer");
	}

	public String getS046DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s046 drawer heading");
		return heading;
	}

	public String getS046DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s046 drawer content");
		return content;
	}

	public void verifyS046(String expectedQuestionMedicaid, String expectedQuestionCHIP, String drawerHeading,
			String drawerContent) throws InterruptedException {
		String question = getS046Question();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s046");

//		clickS046DrawerLink();
//
//		String actualDrawerHeading = getS046DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s046");
//
//		String drawerContentFound = getS046DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		Assert.assertTrue(actualDrawerContent.contains(drawerContent), "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s046");
	}

	public void s046EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P1(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P2(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P3(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P4(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P5(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P6(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[6]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P7(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[7]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P8(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[8]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void hasHouseHoldIncomChanged_S049_P5(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath( "(//span//span[text()='" + decision + "'])[6]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void s049EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}
	public String getS049Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question1, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}

	public String getS049Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}

	public void verifyS049ForOneQuestion(String expectedQuestionMedicaid, String expectedQuestionCHIP)
			throws InterruptedException {
		Wait.wait5Second();
		String question = getS049Question1();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}

	public void verifyS049(String expectedQuestionMedicaid, String expectedQuestionCHIP) throws InterruptedException {
		Wait.wait5Second();
		String question = getS049Question1();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");

		question = getS049Question2();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}

	public void whoIsPregnant_S053(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public String getS053Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s053 question");
		return question;
	}

	public String getS053Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s053 question2");
		return question;
	}

	public void clicks053DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s053DrawerLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s053 drawer");
	}

	public String getS053DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053DrawerHeading, 60);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s053 drawer heading");
		return heading;
	}

	public String gets053DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053DrawerContent, 60);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s053 drawer content");
		return content;
	}

	public void verifyS053(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS053Question();
		String question = questionFound.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s053");

//		clicks053DrawerLink();
//
//		String actualDrawerHeading = getS053DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s053");
//
//		String drawerContentFound = gets053DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s053");

	}

	public void verifyS053Question2(String expectedQuestion2) throws InterruptedException {
		String question = getS053Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s053");
	}

	public void selectBabyCount(String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectBabyCount, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectBabyCount, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(count);
		ExtentTestManager.getTest().info("Baby count selected: " + count);
	}

	public void incomeThisMonth_S057(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for S057");
	}

	public String getS057Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question");
		return question;
	}

	public String getS057Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question2");
		return question;
	}

	public String getS057Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question3, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question3");
		return question;
	}

	public String getS057Question4() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question4, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question3");
		return question;
	}

	public void verifyS057QuestionHaveIncomeThisMonth(String expectedQuestion) throws InterruptedException {
		String question = getS057Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question2IncomeType(String expectedQuestion2) throws InterruptedException {
		String question = getS057Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question3IncomeDuration(String expectedQuestion3) throws InterruptedException {
		String question = getS057Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion3);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion3, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question4EnterIncome(String expectedQuestion4) throws InterruptedException {
		String question = getS057Question4();
		Assert.assertTrue(question.contains(expectedQuestion4), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void selectIncomeType(String type) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectJobType, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(type);
		ExtentTestManager.getTest().info("Job type selected: " + type);
	}

	public void enterEmployerName(String employerName) {
		WebElement element = waitForElementToBePresent(OR.enterEmployerName, 60);
		sendKeysToElement(element, employerName, " first name");
	}

	public void incomePeriod_S057(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for S057");
	}

	public void enterIncomeAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void enterIncomeAmountWithOutTab(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 60);
		// element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void enterIncomeAmountWithOutArrowRight(String amount) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 60);
		element.clear();
		Wait.wait2Second();
		element.sendKeys(Keys.ARROW_RIGHT);
		Wait.wait2Second();
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void expensePeriod_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S058");
	}

	public void expenseType_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S058");
	}

	public void expenseDecision_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[text()='" + decision + "']"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S058");
	}

	public void enterExpenseAmount_S058(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterExpenseAmount, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public String getS058Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s058Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s058 question");
		return question;
	}

	public void verifyS058(String expectedQuestion) throws InterruptedException {
		String question = getS058Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S058");
	}

	public String getMonthlyIncome() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.monthlyIncome, 60);
		Wait.waitForElement(getWebDriver(), element);
		String income = getElementText(element, "monthly income");
		return income;
	}

	public String getYearlyIncome() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.yearlyIncome, 60);
		Wait.waitForElement(getWebDriver(), element);
		String income = getElementText(element, "yearly income");
		return income;
	}

	public void incomeVerification_S059(String decision) throws InterruptedException {
		Wait.wait10Second();
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S059");
	}

	public void incomePredict_S059(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S059");
	}

	public void enterAnuualPreditedAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterAnualPerditedAmount, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public String getS068Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s068Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s068Question, getWebDriver());
		String question = getElementText(element, "s068 question");
		return question;
	}

	public void verifyS068(String expectedQuestion) throws InterruptedException {
		String question = getS068Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S068");
	}

	public void currentlyEnrolled_S068(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S068");
	}

	public String getS082Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s082Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s082 question");
		return question;
	}

	public void verifyS082(String expectedQuestion) throws InterruptedException {
		String questionFound = getS082Question();
		String[] question = questionFound.split("\n");
		Assert.assertTrue(question[0].contains(expectedQuestion), "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s082");
	}

	public void stateBenifitPlanThroughJob_S082(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S082");
	}

	public String getS069AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069AQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s069A question");
		return question;
	}

	public void verifyS069A(String expectedQuestion) throws InterruptedException {
		String question = getS069AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069A");
	}

	public void throughJobICHRA_S069A(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S069A");
	}

	public String getS069BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069BQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		String question = getElementText(element, "s069B question");
		return question;
	}

	public void verifyS069B(String expectedQuestion) throws InterruptedException {
		Wait.wait5Second();
		String question = getS069BQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069B");
	}

	public void throughJobICHRAHaveNotAccept_S069B(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S069A");
	}

	public String getS070Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s070Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		String question = getElementText(element, "s070 question");
		return question;
	}

	public void verifyS070(String expectedQuestion) throws InterruptedException {
		Wait.wait5Second();
		String question = getS070Question();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s070");
	}

	public void CoverageThroughJobStartingNextMonth_S070(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S070");
	}

	public String getS074Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s074Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s074 question");
		return question;
	}

	public void verifyS074(String expectedQuestion) throws InterruptedException {
		Wait.wait5Second();
		String question = getS074Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s074");
	}

	public String getS090Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question");
		return question;
	}

	public void verifyS090(String expectedQuestion) throws InterruptedException {
		String question = getS090Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public void whoGetMarried_S090(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S090");
	}

	public void s090EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		sendKeysToElement(element, date, " Date");
	}

	public void s088EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088EnterDateOnSamePage(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateOnSamePage, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088enterDateToFilledField(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateToFilledField, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088enterDateToFilledFieldOnSamePage(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateToFilledFieldOnSamePage, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public String getS090Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question2");
		return question;
	}

	public void verifyS090Question2(String expectedQuestion) throws InterruptedException {
		String question = getS090Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public String getS090Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question3, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question3");
		return question;
	}

	public void verifyS090Question3(String expectedQuestion) throws InterruptedException {
		String question = getS090Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public void qualifyForHealthCoverageIn60Days_S090(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S090");
	}

	public void clickLogoutDropDown() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickLogoutDropDown, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " logout drop down");
	}

	public void clickLogout() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickLogout, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " for logout");
	}

	public void clickHome() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickHome, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " for Home");
	}

	public void enterAgainDob(String dob) {
		WebElement element = waitForElementToBeClickable(OR.enterDOB, 60);
		sendKeysToElement(element, dob, dob);
	}

	public String enterDobAgent(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDobAgent, 60);
		String dob = ESTTimeZone.getDobFromAge(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}

	public void clickApplication() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickApplication, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for Application");
	}

	public void clickReportLifeChangeLink() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickReportLifeChangeLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for report a life change");
	}

	public void mainPersonTakingCare_S041A(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for main person taking care");
	}

	public void clickReportLifeChangeButton() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickReportLifeChangeButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for report a life change");
	}

	public void clickContinueToEnrollmentBtn() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.continueToEnrollmentBtn, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " continue to enrollment");
	}

	public void howMuchFromYourLowerPremium(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " how much from your lower premium");
	}

	public void selectPlan(String plan) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//label[contains(text(),'" + plan + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, plan + " how much from your lower premium");
	}

	public void clickEnrol(String selectedPlan) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath(
				"//label[contains(text(),'" + selectedPlan + "')]//parent::div//following-sibling::div//button"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, selectedPlan + " enroll button");
	}

	public void continueButtonAfterEligibility() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.continueButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " continue button");
	}

	public void clickViewPlans() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.clickViewPlans, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " view plan button");
	}

	public void selectIAgreeCheckBox() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.agreeCheckBox, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " i agree");
	}

	public void goBackToHomeButton() throws InterruptedException {
		Wait.wait10Second();
		WebElement element = waitForElementToBeClickable(OR.goBackToHomeButton, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(OR.goBackToHomeButton, getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.wait10Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();

	}

	public void backNavigation() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.backNavigation);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " back navigation");
	}

	public void clickCreateSearchLink() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.createSearchLink, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " create search application link");
	}

	public void clickSearchForApplicationBtn() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = getWebDriver().findElement(OR.searchForApplicationBtn);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " search for application button");
	}

	public void clickCheckBoxForSearch() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = getWebDriver().findElement(OR.checkBoxForSearch);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element,
				" check box : Check here to indicate you've gotten permission from this person to search for his or her application.");
	}

	public void enterFirstNameForSearch(String firstName) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.firstNameForSearch, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, firstName, "first name");
	}

	public void enterLastNameForSearch(String firstName) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.lastNameForSearch, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, firstName, "last name");
	}

	public void enterDobForSearch(String dob) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.dobForSearch, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, dob, "date of birth for search");
	}

	public void clickSearchButton() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.clickSearchButton);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " search button");
	}

	public void clickApplicationToupdate(String applicationId) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = getWebDriver().findElement(By.xpath(
				"//td[contains(text(),'" + applicationId + "')]//..//..//..//..//..//..//a[@id='collapseOneHeading']"));
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "drop down for update button");
	}

	public void clickUpdateApplication(String appId) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = getWebDriver().findElement(By.xpath("//td[contains(text(),'" + appId
				+ "')]//..//..//..//..//..//..//div[@class='accordion-body collapse show']//button//span[contains(text(),' UPDATE APPLICATION')]"));
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " update application button");
	}

	public void selectIdentityProofing(String identity) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBePresent(OR.selectIdentityProofing, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(identity);
		ExtentTestManager.getTest().info("Identity selected: " + identity);
	}

	public void clickContinueIdentityProofing() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.continueIdentityProofing);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "drop down for update button");
	}

	public String getS030Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s030Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s030 question");
		return question;
	}

	public void verifyS030Question(String expectedQuestion) throws InterruptedException {
		String question = getS030Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s030");
	}

	public void liveWithAnotherParent_S030(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("//span[contains(@data-bind,'css: question.koCss().controlLabel')]//span[contains(text(),'"
						+ decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " live with another parent");
	}

	public String getS045Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s045Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s045 question");
		return question;
	}

	public String getS045Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s045Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s045 question");
		return question;
	}

	public void verifyS045Question(String expectedQuestion1, String expectedQuestion2) throws InterruptedException {
		String question = getS045Question1();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion1);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion1, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s045");

		question = getS045Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s045");
	}

	public void physicalDisability_S045(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[1]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " physical disability");
	}

	public void helpWithDailyActivities_S045(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " help with daily activities");
	}

	public String getS051Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s051Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s051 question");
		return question;
	}

	public void verifyS051Question(String expectedQuestion) throws InterruptedException {
		String question = getS051Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s051");
	}

	public void whoIsFullTimeStudent_S051(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is full time student");
	}

	public String getS051Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s051Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s051 question2");
		return question;
	}

	public void verifyS051Question2(String expectedQuestion) throws InterruptedException {
		String questionFound = getS051Question2();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s051");
	}

	public void isThereAnyGardianInAppState_S051(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is full time student");
	}

	public void enterLoseCoverageDate_S083(String date) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.loseCoverageDate, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, date, "lose coverage date");
		Wait.wait2Second();
		WebElement elements = waitForElementToBeClickable(OR.enterPlanName, 60);
		elements.click();

	}

	public String getS019Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s019Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s019 question");
		return question;
	}

	public void verifyS019(String expectedQuestion) throws InterruptedException {
		String question = getS019Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S019");
	}

	public void immigrationStatus_S019(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " eligible immigration status");
	}

	public String getS019Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s019Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s019 question2");
		return question;
	}

	public void verifyS019Question2(String expectedQuestion) throws InterruptedException {
		String questionFound = getS019Question2();
		String question = questionFound.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S019");
	}

	public void selectDocument_S019(String document) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectDocument, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(document);
		ExtentTestManager.getTest().info("Document selected: " + document);
	}

	public void selectDocumentType_S019(String documentType) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectDocumentType, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(documentType);
		ExtentTestManager.getTest().info("Document type selected: " + documentType);
	}

	public void enterAlienNumber_S019(String alienNumber) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.enterAlienNumberS019, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Alien Number");
	}

	public void clickContinueWithoutAddingMore() throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(OR.continueWithoutAddingMore, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " continue without adding more");
	}

	public String getS027QuestionSomeOneElseTaxReturn() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionSomeOneElseTaxReturn, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public void verifyS027QuestionSomeOneElseTaxReturn(String expectedQuestion) throws InterruptedException {
		String questionFound = getS027QuestionSomeOneElseTaxReturn();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S027");
	}

	public void questionSomeOneElseTaxReturn_S027(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " eligible immigration status");
	}

	public String getS050Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s050Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s050 question");
		return question;
	}

	public void verifyS050(String expectedQuestionMedicaid, String expectedQuestionCHIP, String expectedImigration)
			throws InterruptedException {
		Wait.wait5Second();
		String question = getS050Question();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedImigration), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s050");
	}

	public void deniedMedicaidCHIPBecauseOfImmigrationStatus_S050(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " denioed eligibile because of immigration status");
	}

	public void hadCurrentImmigrationStatusSinceFiveYear_S050(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " immigration status since 5 years");
	}

	public void changeimmigrationStatusDueToNonEligibleForMedicaidCHIP_S050(String decision)
			throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " change in immigration status due to not eligible for Medicaid and CHIP");
	}

	public boolean verifyQuestion1_S044() throws InterruptedException {
		List<WebElement> element = getWebDriver().findElements(OR.s044Question1);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public boolean verifyQuestion2_S044() throws InterruptedException {
		List<WebElement> element = getWebDriver().findElements(OR.s044Question2);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public void verifyS044() throws InterruptedException {
		Wait.wait5Second();
		boolean question1Found = verifyQuestion1_S044();
		Assert.assertEquals(question1Found, true,
				"Failed to verify: Are any of these people an honorable discharged veteran or active duty member of the military? ");
		ExtentTestManager.getTest().info(
				"Verified: Are any of these people an honorable discharged veteran or active duty member of the military?  on S044");

		boolean question2Found = verifyQuestion2_S044();
		Assert.assertEquals(question2Found, true,
				"Failed to verify: Do any of these people have a deceased spouse who was an honorable discharged veteran or active duty member of the military? ");
		ExtentTestManager.getTest().info(
				"Verified : Do any of these people have a deceased spouse who was an honorable discharged veteran or active duty member of the military?  om S044");

	}

	public void isAnyOneVetran_S044(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[1]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " any one vetran");
	}

	public void isAnyOneSpouseOfVetran_S044(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " any one spouse of vetran");
	}

	public boolean verifyQuestion_S094() throws InterruptedException {
		Wait.wait3Second();
		List<WebElement> element = getWebDriver().findElements(OR.s094Question);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public void verifyS094() throws InterruptedException {
		Wait.wait2Second();
		boolean question1Found = verifyQuestion_S094();
		Assert.assertEquals(question1Found, true, "Failed to verify: Which of these people are incarcerated?");
		ExtentTestManager.getTest().info("Verified: Which of these people are incarcerated?  on S044");
	}

	public void incarceratedPendingDisposition_S094_P1(String decision) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[1]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}

	public void incarceratedPendingDisposition_S094_P2(String decision) throws InterruptedException {
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}

	public void whoIsIncarcerated_S094(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is incarcerated");
	}

	public String getS088Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s088Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s088 question");
		return question;
	}

	public void verifyS088(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS088Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s088");
	}

	public void whoRecentlyMoved_S088(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is recently moved");
	}

	public String getS088DateErrorMessage() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s088DateErrorMessage, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s088 question");
		return question;
	}

	public void verifyErrorOnDate(String expectedError) throws InterruptedException {
		Wait.wait2Second();
		String error = getS088DateErrorMessage();
		ExtentTestManager.getTest().info("Expected: " + expectedError);
		ExtentTestManager.getTest().info("Found: " + error);
		Assert.assertEquals(error, expectedError, "Failed to verify: " + error);
		ExtentTestManager.getTest().info("Verified: " + error + " on s088");
	}

	public void priorCoverageQuestion_S088(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " prior coverage");
	}

	public void priorCoverageQuestion_S088OnSamePage(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"),
					60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " prior coverage");
	}

	public String getS054Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s054Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s054 question");
		return question;
	}

	public void verifyS054(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS054Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s054");
	}

	public void whoIsInFosterCare_S054(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is recently moved");
	}

	public void selectFosterCareState(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectFosterCareState, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void receivingMedicaidWhileFosterCare_S054(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " receiving Medicaid while in foster care");
	}

	public void enterAgeFosterCareLeft(String age) {
		WebElement element = waitForElementToBePresent(OR.enterAgeFosterCareLeft, 60);
		sendKeysToElement(element, age, " age when left foster care");
		element.sendKeys(Keys.TAB);
	}

	public void applyForHealthCoverage_S047(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " apply for health coverage");
	}

	public void applyAfterQualifyingLifeEvent_S048(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " apply after qualifying life event");
	}

	public void whatTypeCoverageHave_S069(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for S069");
	}

	public void s083EnterDate(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterDate, getWebDriver());

		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void selectToAddNonAplicantSpouse_S026(String selection) throws InterruptedException {
		String path = "//select[@class='form-control']";
		WebElement element = waitForElementToBePresent(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(selection);
		ExtentTestManager.getTest().info("State selected: " + selection);
	}

	public void doAnyOtherFamilyMemberLiveOnThisAddress_S034(String decision) throws InterruptedException {
		Wait.wait5Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		String path = "//span//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do any other family member live on this address");
	}

	public void canYouProvideMoreInfo_S034(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " can you provide mor information");
	}

	public void liveWithParentOrStepParent_S035(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with parent or step parent");
	}

	public void liveWithBrotherSisterUnderAge_S036(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " do live with brother sister who are under age");
	}

	public void liveWithSonDaughterStepSonStepDaughter_S037(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void liveWithHusband_S037(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void liveWithSonDaughterStepSonStepDaughter2_S037(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void whatIsHomeAddress_S041(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " what is home address");
	}

	public void selectGender_S038(String gender) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectGender_S038, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(gender);
		ExtentTestManager.getTest().info("Gender selected: " + gender);
	}

	public String getS052Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s052Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s052 question");
		return question;
	}

	public void verifyS052(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS052Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s052");
	}

	public void whoIsAmericanAlaskan_S052(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who is american alaskan");
	}

	public String getS075Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s075Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s075 question");
		return question;
	}

	public void verifyS075(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS075Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s075");
	}

	public void whoFederallyRecognizedTribe_S075(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who federally recognized tribe");
	}

	public String getS075Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s075Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s075 question2");
		return question;
	}

	public void verifyS075Question2(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS075Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s075");
	}

	public void selectState_S075(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectState_S075, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectState_S075, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectTribe_S075(String tribe) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectTribe, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectTribe, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(tribe);
		ExtentTestManager.getTest().info("Baby count selected: " + tribe);
	}

	public void isTribeSourceIncome_S057(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who federally recognized tribe");
	}

	public void enterTribeIncomeAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterTribeIncomeAmount, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void haveHealthCoverageNow_S078(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " have health coverage now");
	}

	public String getS064Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s064Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s064 question");
		return question;
	}

	public void verifyS064(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String questionFound = getS064Question();
		String question = questionFound.replace("/n", "");
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s064");
	}

	public void incomeDiscripancy_S064(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " income discripancy question");
	}

	public void clickAddNewIncomeSource() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickAddNewIncomeSource, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickAddNewIncomeSource, getWebDriver());
		clickElement(element, " add new income");
	}

	public void enterCoverageName(String coverageName) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterCoverageName, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterCoverageName, getWebDriver());
		sendKeysToElement(element, coverageName, " coverage name");
	}

	public void enterPolicyNumber(String policyNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPolicyNumber, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterPolicyNumber, getWebDriver());
		sendKeysToElement(element, policyNumber, " policy number");
	}

	public void describeExpense(String expenseDescription) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.describeExpense, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.describeExpense, getWebDriver());
		sendKeysToElement(element, expenseDescription, " expense description");
	}

	public String getS081Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s081Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s081Question, getWebDriver());
		String question = getElementText(element, "s081 question");
		return question;
	}

	public void verifyS081Question(String expectedQuestion) throws InterruptedException {
		String question = getS081Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s081");
	}

	public void coverageThroughJobEndedInLast3Months_S081(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " has coverage through job that ended in last three months");
	}

	public void whyCoverageEnd_S081(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " reason of coverage end");
	}

	public void whyCoverageEnd_S081_2(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " reason of coverage end");
	}

	public String getS069CQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069CQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069CQuestion, getWebDriver());
		String question = getElementText(element, "s069C question");
		return question;
	}

	public void verifyS069C(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS069CQuestion();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069C");
	}

	public void ableToUseHRA_S069C(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " able to use HRA");
	}

	public String getS069CQuestion2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069CQuestion2, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069CQuestion2, getWebDriver());
		String question = getElementText(element, "s069C question2");
		return question;
	}

	public void verifyS069CQuestion2(String expectedQuestion) throws InterruptedException {
		String question = getS069CQuestion2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069C");
	}

	public void whichEmployerOfferHRA_S069C(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public String getS069EQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069EQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069EQuestion, getWebDriver());
		String question = getElementText(element, "s069E question");
		return question;
	}

	public void verifyS069E(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS069EQuestion();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069E");
	}

	public void enterStartDateJobA(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.startDateJobA, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.startDateJobA, getWebDriver());
		sendKeysToElement(element, date, " start date");
	}

	public void enterEndDateJobA(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.endDateJobA, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.endDateJobA, getWebDriver());
		sendKeysToElement(element, date, " end date");
	}

	public void enterIchraAmountOffered(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIchraAmountOffered, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Maximum self-only amount of reimbursement offered: " + amount);
	}

	public void enterStartDateJobB(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.startDateJobB, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.startDateJobB, getWebDriver());
		sendKeysToElement(element, date, " start date");
	}

	public void enterEndDateJobB(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.endDateJobB, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.endDateJobB, getWebDriver());
		sendKeysToElement(element, date, " end date");
	}

	public void enterIchraAmountOfferedJobB(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIchraAmountOfferedJobB, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Maximum self-only amount of reimbursement offered: " + amount);
	}

	public void selectIchraAmountPeriod(String period) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectIchraAmountPeriod, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectIchraAmountPeriod, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(period);
		ExtentTestManager.getTest().info("Period of ICHRA amount selected: " + period);
	}

	public void selectCoverageTypeApplicant_S069D(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectCoverageTypeApplicantSpouse1_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectCoverageTypeApplicantSpouse2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void indiviualStartDate_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void indiviualNoticeDate_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void indiviualStartDate2_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void indiviualNoticeDate2_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void qsehraStartDate_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void qsehraNoticeDate_S069D(String date) throws InterruptedException {
		String path = "(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void isCurrentlyEnrolledThroughEmployer_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void isCurrentlyEnrolledThroughEmployer2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void qsehraThroughEmployer_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void qsehraThroughEmployer2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectWhoLiveOnThisAddress_S041A(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " lives on same address");
	}

	public void whoIsSonDaughterOrStepSonDaughter_S037(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who lives on same address");
	}

	public void whoIsTaxFilerWhoClaims_S028(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who is claming");
	}

	public void liveWithTaxFilerParentWhoClaims_S031(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "live with who is claming");
	}

	public void liveWithOtherParent_S031(String decision, String index) throws InterruptedException {
		String path = "";
		if (index.equals("2")) {
			path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		} else if (index.equals("1")) {
			path = "//span//span[contains(text(),'" + decision + "')]";
		}
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "live with who is claming");
	}

	public void isClaimingAnyOtherInTaxReturn_S033(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "claim any other one under tax return as dependent");
	}

	public void whoIsBrotherSisterStepSister_S036(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " is brother, step brother, sister, step sister");
	}

	public void selectParentOrStepParent_S035(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who lives on same address");
	}

	public void doYouWantToGiveMoreInfoAboutTaxFilerWhoClaims_S031A(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " i want to give information about tax filer who claims");
	}

	public String getS086Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s086Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s086 question");
		return question;
	}

	public void verifyS086(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String questionFound = getS086Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s086");
	}

	public void whoRecentlyGainEligibleImigrationStatus_S086(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " recently gain eligible imigration status");
	}

	public void s086EnterDateP1(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP1, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s086EnterDateOP2(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP2, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s086EnterDateP3(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP3, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public String getS010BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010BQuestion, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s010B question");
		return question;
	}

	public void verifyS010B(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS010BQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s010B");
	}

	public void removeOrKeepHimInApplicationWithoutCoverage_S010B(String decision) throws InterruptedException {
		String path = "//label//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " recently gain eligible imigration status");
	}

	public void reasonOfRemove_S010B(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void s010BEnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 60);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void selectCoverage_S010(String applicantFirstName, String decision) throws InterruptedException {
		String path = "//span[text()='" + applicantFirstName
				+ "']/../../../../following-sibling::div/div/div/div/div/div/following-sibling::div/fieldset/div/label/span/span[text()='"
				+ decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterHours(String hours) {
		WebElement element = waitForElementToBePresent(OR.enterHours, 60);
		element.clear();
		element.sendKeys(hours);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Hours enter: " + hours);
	}

	public String getS042Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getS042Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question2, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s042 question2");
		return question;
	}

	public String getS042Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question3, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s042 question3");
		return question;
	}

	public void verifyScreen_s042_Question1(String expectedQuestion) throws InterruptedException {
		String question = getS042Question1();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S042");
	}

	public void verifyScreen_s042_Question2(String expectedQuestion) throws InterruptedException {
		String question = getS042Question2();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S042");
	}

	public void verifyScreen_s042_Question3(String expectedQuestion) throws InterruptedException {
		String question = getS042Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S042");
	}

	public void livingOutSideStateTemporarily_S042(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void applicantHomeAddress_S042(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterStreetAddress_S042(String streetAddress) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042StreetAddress, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, streetAddress, " street address");
	}

	public void clickCountyDropDown_S042() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.selectCounty, 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county drop down");
	}

	public String getS024Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s024Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s024 question");
		return question;
	}

	public void verifyScreen_s024_Question(String expectedQuestion) throws InterruptedException {
		String question = getS024Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S024");
	}

	public void isUS_CitizenFrom1996_S024(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public String getS071Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s071Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s071 question");
		return question;
	}

	public void verifyScreen_s071_Question(String expectedQuestion) throws InterruptedException {
		String question = getS071Question();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S071");
	}

	public void whichEmployerOfferThisCoverage_S071(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void anotherEmployerOfferThisCoverage_S072(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public String getS072Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s072Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s072 question");
		return question;
	}

	public void verifyScreen_s072_Question(String expectedQuestion) throws InterruptedException {
		String question = getS072Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S072");
	}

	public void doYouWantToAddAnOtherEmployer_S072(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public String getS073Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s073 question");
		return question;
	}

	public void verifyScreen_s073_Question(String expectedQuestion) throws InterruptedException {
		String question = getS073Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S073");
	}

	public void doesEmployerCoverageMeetMinimumValueStandard_S073(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterAmount_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 60);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void selectPremiumPeriod_s073(String period) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073PremiumPeriod, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s073PremiumPeriod, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(period);
		ExtentTestManager.getTest().info("Period selected: " + period);
	}

	public String getS079Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s079Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s079 question");
		return question;
	}

	public void verifyScreen_s079_Question(String expectedQuestion) throws InterruptedException {
		String question = getS079Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S079");
	}

	public void isParentLiveOutSideHome_S079(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void selectEmailAddress_S005(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void selectRace_S043(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision);
	}

	public String getS067Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s067Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s067Question, getWebDriver());
		String question = getElementText(element, "s067 question");
		return question;
	}

	public void verifyScreen_s067_Question(String expectedQuestion) throws InterruptedException {
		String question = getS067Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S067");
	}

	public void isAnyOneGetApprovedForUnEmploymentCompensation_S067(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterReasonToDiffrenceIncome_S063(String reason) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.reasonToDiffrenceIncome, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, reason, " reason of income difference");
	}

	public String getS063Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s063Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s063Question, getWebDriver());
		String question = getElementText(element, "s063 question");
		return question;
	}

	public void verifyScreen_s063_Question(String expectedQuestion) throws InterruptedException {
		String question = getS063Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S063");
	}

	public void homeAddress_S002(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterEmployerNameS069(String employerName) {
		WebElement element = waitForElementToBePresent(OR.enterEmployerNameS069, 60);
		sendKeysToElement(element, employerName, " employer name");
	}

	public void clickContinueApplication() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueApplication, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueApplication, getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue application");
	}

	public void clickContinueApplicationAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueApplicationAgent, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueApplicationAgent, getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue application");
	}

	public void enterAptcAmount(String aptc) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterAptcAmount, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(OR.enterAptcAmount, getWebDriver());
		sendKeysToElement(element, aptc, " APTC amount");
	}

	public String getSsnError() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.invalidSsnError, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.invalidSsnError, getWebDriver());
		String question = getElementText(element, "ssn error");
		return question;
	}

	public void verifySsnError(String expectedError) throws InterruptedException {
		String errorFound = getSsnError();
		ExtentTestManager.getTest().info("Expected: " + expectedError);
		ExtentTestManager.getTest().info("Found: " + errorFound);
		Assert.assertEquals(errorFound, expectedError, "Failed to verify: " + errorFound);
		ExtentTestManager.getTest().info("Verified: " + errorFound + " on S063");
	}

	public void enterInvalidSSN(String ssn) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterSSN, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, ssn, " SSN number");
		element.sendKeys(Keys.TAB);
	}
	public void enterI94Number(String number) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.i94Number, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, number, " I-94 number");
	}
	public void enterHoursForP1(String hours) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.hoursForP1, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, hours, " hours for p1");
	}
	public void enterHoursForP2(String hours) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.hoursForP2, 60);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, hours, " hours for p2");
	}
	public String getS80Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s80Question, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s80Question, getWebDriver());
		String question = getElementText(element, "s80 question");
		return question;
	}

	public void verifyS80Question(String expectedQuestion) throws InterruptedException {
		String questionFound = getS80Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + questionFound);
		Assert.assertEquals(questionFound, expectedQuestion, "Failed to verify: " + questionFound);
		ExtentTestManager.getTest().info("Verified: " + questionFound + " on S080");
	}
	public void selectYear(String year) throws InterruptedException {
		Wait.wait5Second();
		WebElement element = waitForElementToBePresent(OR.applicationYear, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.applicationYear, getWebDriver());
		Wait.wait5Second();
		
		Select select = new Select(element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		select.selectByVisibleText(year);
		ExtentTestManager.getTest().info("year selected: " + year);
	}
	public ArrayList<String> getYears() throws InterruptedException{
		List<WebElement> elements=getWebDriver().findElements(OR.getYear);
		Wait.waitForElement(getWebDriver(), elements.get(0));
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.getYear, getWebDriver());
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<elements.size();i++) {
			list.add(elements.get(i).getText());
		}
		return list;
	}
	public void healthServiceFromIHS_S076_P1(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for IHS");
	}

	public void healthServiceFromIHS_S076_P2(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for eligible to health service");
	}
	public void helpPayingBill_S077(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " help paying bill");
	}
	public void enterEmployerNameCobra_S069(String employerName) {
		WebElement element = waitForElementToBePresent(OR.employerNameCobra_S069, 60);
		sendKeysToElement(element, employerName, " employer name");
	}
	public void selectRelationS28_Item92(String selection) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectRelationS28_Item92, 60);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(selection);
		ExtentTestManager.getTest().info("Relation selected: " + selection);
	}
}
