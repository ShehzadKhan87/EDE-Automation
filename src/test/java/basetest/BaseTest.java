package basetest;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import listeners.TestListener;
import pages.BasePage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentManager;
import utils.ExtentTestManager;
import utils.LogUtil;
import utils.Utility;
import utils.Wait;
import utils.WebSetup;

public class BaseTest  {
	BasePage basePage=new BasePage();
	LoginPage loginPage=new LoginPage();
	
    @BeforeTest
    public void openBrowser() {
    	
        WebSetup.getInstance().initDriver();
        
    }

   @AfterSuite
    public void finish(){
    	LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onFinish");
		ExtentManager.getReporter().flush();
    }
    
    @AfterTest
    public void closeBrowser() {
    	
    	Utility.attachWebScreenShotToReport(ExtentTestManager.name+"_"+ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
    	//WebSetup.getInstance().getDriver().close();
       // WebSetup.getInstance().nullDriver();
    }
    
    //Load url and login to edeqa
    public void loginEdeQa(String userName,String Password,String url) throws IOException, InterruptedException {
    	Wait.wait3Second();
    	String edeEmail=Utility.getValue("edeEmail");
    	String edePassword=Utility.getValue("edePassword");
    	String lnkSignInEDE = Utility.getValue("lnkSignIntoEDE");
    	basePage.loadPage(url);
    	Utility.attachWebScreenShotToReport(ExtentTestManager.name+"_"+ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
    	Wait.wait5Second();
    	loginPage.clickSignInLnk();
    	//loginPage.enterUserName(userName);
    	//loginPage.enterPassword(Password);
    	//loginPage.clickSignInButton();
    	Wait.wait10Second();
    	loginPage.enterEmailEDE(edeEmail);
    	loginPage.enterPasswordEDE(edePassword);
    	loginPage.clickSignInButtonEDE();
    	Wait.wait5Second();
    }
    public void refreshPage() {
    	basePage.getWebDriver().navigate().refresh();
    }
    
}
