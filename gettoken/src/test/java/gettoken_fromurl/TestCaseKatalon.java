package gettoken_fromurl;

//public class TestCaseKatalon {
//
//}

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseKatalon {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPartner158() throws Exception {
    driver.get("http://10.20.30.66:8070/FormConsumerLogin.aspx?");
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtUserName")).click();
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtUserName")).clear();
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtUserName")).sendKeys("ja1234");
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtPassword")).click();
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtPassword")).clear();
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtPassword")).sendKeys("Pass@word1");
    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_btnSignIn")).click();
    driver.findElement(By.id("ctl00_PlaceHolderBodyMain_cmdGotoPortal")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("proofingChannel")).click();
    Thread.sleep(5000);
    new Select(driver.findElement(By.id("proofingChannel"))).selectByVisibleText("Telephone");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//option[@value='TELEPHONE']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("FirstNameTelephone")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("FirstNameTelephone")).clear();
    driver.findElement(By.id("FirstNameTelephone")).sendKeys("Emilyys");
    driver.findElement(By.id("LastNameTelephone")).clear();
    driver.findElement(By.id("LastNameTelephone")).sendKeys("Richardd");
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("01011991");
    driver.findElement(By.id("btnContinueTelephone")).click();
    Thread.sleep(5000);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='main']/div/div/div[5]")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='main']/div/div/div[7]/button")).click();
    
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sq_100']/div/div/div/p/b")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='sq_106']/div/fieldset/div/label")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='sq_107']/div/fieldset/div/label")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='sq_108']/div/fieldset/div/label")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    Thread.sleep(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_109']/div[2]/fieldset/div/label/span[3]/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='sq_114']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_114']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.id("sq_119i")).click();
    driver.findElement(By.id("sq_119i")).click();
    driver.findElement(By.id("sq_119i")).clear();
    driver.findElement(By.id("sq_119i")).sendKeys("170 E Main St");
    driver.findElement(By.id("sq_119i")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("sq_121i")).click();
    driver.findElement(By.id("sq_121i")).clear();
    driver.findElement(By.id("sq_121i")).sendKeys("Chilton");
    driver.findElement(By.id("sq_121i")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("sq_123i")).click();
    driver.findElement(By.id("sq_123i")).clear();
    driver.findElement(By.id("sq_123i")).sendKeys("53014");
    driver.findElement(By.id("sq_123i")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("sq_125i")).click();
    new Select(driver.findElement(By.id("sq_125i"))).selectByVisibleText("Calumet");
    driver.findElement(By.xpath("//option[@value='Calumet']")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_127']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.id("sq_139i")).click();
    driver.findElement(By.id("sq_139i")).clear();
    driver.findElement(By.id("sq_139i")).sendKeys("3334445556");
    driver.findElement(By.id("sq_139i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='sq_141']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='sq_141']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_150']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_150']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sp_111']/div[2]/div[5]")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_179']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_179']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_237']/div/fieldset/div/label")).click();
    String SSN = driver.findElement(By.xpath("//div[@id='sq_235']/div/div/div")).getText();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/popup/div/div/div/div/div[2]/div")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("myModalLabel")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div[@id='sq_244']/div/h5/span")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sq_244']/div/h5/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='sq_244']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_244']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_245']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_245']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_251']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_251']/div[2]/fieldset/div[2]/label")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sq_252']/div/h5/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("sq_252i")).click();
    new Select(driver.findElement(By.id("sq_252i"))).selectByVisibleText("Someone else who isn't applying for coverage");
    driver.findElement(By.xpath("//option[@value='someoneelse']")).click();
    driver.findElement(By.id("sq_253i")).click();
    driver.findElement(By.id("sq_253i")).clear();
    driver.findElement(By.id("sq_253i")).sendKeys("Richard");
    driver.findElement(By.id("sq_253i")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("sq_255i")).click();
    driver.findElement(By.id("sq_255i")).clear();
    driver.findElement(By.id("sq_255i")).sendKeys("Gilly");
    driver.findElement(By.id("sq_255i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.cssSelector("input.form-control.flatpickr-input.input.w-95.datepicker.masked.active")).clear();
    driver.findElement(By.cssSelector("input.form-control.flatpickr-input.input.w-95.datepicker.masked.active")).sendKeys("02/02/1991");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='sq_258']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_258']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sq_261']/div/h5/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='sq_261']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_261']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_266']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_266']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_289']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_289']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_293']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_293']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sp_145']/div/h4/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_330']/div[2]/fieldset/div[2]/label/span[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_337']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_337']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_340']/div[2]/fieldset/div[4]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_341']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_341']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.id("sq_342i")).click();
    new Select(driver.findElement(By.id("sq_342i"))).selectByVisibleText("Job (like salary, wages, commissions, or tips)");
    driver.findElement(By.xpath("//option[@value='JOB']")).click();
    driver.findElement(By.id("sq_360i")).click();
    driver.findElement(By.id("sq_360i")).clear();
    driver.findElement(By.id("sq_360i")).sendKeys("job a");
    driver.findElement(By.id("sq_360i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='sq_362']/div[2]/fieldset/div[7]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_362']/div[2]/fieldset/div[7]/label/span[3]/span")).click();
    driver.findElement(By.id("sq_370i")).click();
    driver.findElement(By.id("sq_370i")).click();
    driver.findElement(By.xpath("//div[@id='sq_370']/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='sq_370']/div/input")).sendKeys("20,000");
    driver.findElement(By.id("sq_370i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    String jetHealthSolutions = driver.getTitle();
    driver.findElement(By.xpath("//div[@id='sq_381']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_381']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_389']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_389']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[@id='sq_395']/div/h5/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='sq_395']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_395']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.id("sq_396i")).click();
    new Select(driver.findElement(By.id("sq_396i"))).selectByVisibleText("Job (like salary, wages, commissions, or tips)");
    driver.findElement(By.xpath("//option[@value='JOB']")).click();
    driver.findElement(By.id("sq_414i")).click();
    driver.findElement(By.id("sq_414i")).clear();
    driver.findElement(By.id("sq_414i")).sendKeys("Job B");
    driver.findElement(By.id("sq_414i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='sq_416']/div/h5/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_416']/div[2]/fieldset/div[7]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_416']/div[2]/fieldset/div[7]/label")).click();
    driver.findElement(By.id("sq_424i")).click();
    driver.findElement(By.xpath("//div[@id='sq_424']/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='sq_424']/div/input")).sendKeys("20,000");
    driver.findElement(By.id("sq_424i")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_435']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_435']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_443']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_443']/div[2]/fieldset/div/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_449']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_450']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_469']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    String HRAoffer = driver.findElement(By.xpath("//div[@id='sq_470']/div/h5/span")).getText();
    driver.findElement(By.xpath("//div[@id='sq_470']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_471']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_471']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.id("sq_476i_1")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_487']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.xpath("//div[@id='sq_488']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout |  | ]]
    driver.findElement(By.id("sq_508")).click();
    driver.findElement(By.id("sq_508i")).click();
    driver.findElement(By.id("sq_508")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_516']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_516']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_524']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_524']/div[2]/fieldset/div[2]/label/span[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_527']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_527']/div[2]/fieldset/div[2]/label/span[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_527']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_531']/div[2]/fieldset/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_535']/div[2]/fieldset/div[6]/label/span[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='sq_535']/div[2]/fieldset/div[6]/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_535']/div[2]/fieldset/div[6]/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*//div\\[@id='container'\\]/main/div/div/div[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*//div\\[@id='sp_199'\\]/div/h4/span[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='sq_537']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_539']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_539']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_541']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='sq_542']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='sq_544']/div[2]/fieldset/div/label")).click();
    driver.findElement(By.id("sq_545i")).click();
    driver.findElement(By.id("sq_545i")).clear();
    driver.findElement(By.id("sq_545i")).sendKeys("Emily Richard");
    driver.findElement(By.id("surveyElement")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div[2]/div[2]/button")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*//main\\[@id='main'\\]/div/div\\[3\\]/div/div/div/div\\[2\\]/div/table/tbody/tr/td\\[2\\]/span[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
   // driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
