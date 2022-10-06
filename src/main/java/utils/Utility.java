package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.BasicFileReporter;


public class Utility {
	
	public static String captureWebScreenShot(WebDriver driver, String fileName) throws IOException {
		String destinationPath = null;
		String filePath = null;
		try {

			BasicFileReporter reporter = (BasicFileReporter) ExtentTestManager.getTest().getExtent().getStartedReporters().get(0);
			File report = reporter.getFileFile();
			String folder = report.getParent();
			filePath = "screenshot/" + fileName+".png";
			destinationPath = folder + File.separator +  "screenshot/";
			File destination = new File(destinationPath);
			destinationPath = destination.getAbsolutePath();
			Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName(fileName).save(destinationPath);
		} catch (Exception e) {
			LogUtil.getLoggerInstance().error(e.getMessage(), e);
		}
		return filePath;
	}
	
	public static void attachWebScreenShotToReport( String fileName) {
		try {
			String imagePath = captureWebScreenShot(WebSetup.getInstance().getDriver(), fileName);
			ExtentTestManager.getTest().info("Screen Capture", MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
		} catch (Exception e) {
			LogUtil.getLoggerInstance().error("Error while capturing screen", e);
		}

	}
	
		
	public static String getInformationTable(ArrayList<String> label, ArrayList<String> value) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table-localization'>");
		builder.append("<tr>");
		builder.append("<td style='width: 50%;'>Label</td>");
		builder.append("<td style='width: 22%;'>Information</td>");
		builder.append("</tr>");
		for(int i = 0; i < value.size(); i++) {
			builder.append("<tr>");
			builder.append(String.format("<td>%s</td>", label.get(i)));
			builder.append(String.format("<td>%s</td>", value.get(i)));
			builder.append("</tr>");
			
		}
		builder.append("</table>");
		return builder.toString();
	}
	
	public static String getLoggingTable(ArrayList<ArrayList<String>> content) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table'>");
		builder.append("<tr><td>Parameter Name</td><td>Actual Values</td><td>Expected Values</td><td>Results (Pass / Fail)</td><td>Comments</td></tr>");
		for (ArrayList<String> rowContent : content) {
			builder.append("<tr>");
			for (String cellContent : rowContent) {
				builder.append(String.format("<td>%s</td>", cellContent));
			}
			builder.append("</tr>");
		}

		builder.append("</table>");
		return builder.toString();
	}
	
	public static String getLoggingTable(ArrayList<ArrayList<String>> content, String title, String title_2) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table'>");
		builder.append("<tr><td>Parameter Name</td><td>"+title+"</td><td>"+title_2+"</td><td>Results (Pass / Fail)</td><td>Comments</td></tr>");
		for (ArrayList<String> rowContent : content) {
			builder.append("<tr>");
			for (String cellContent : rowContent) {
				builder.append(String.format("<td>%s</td>", cellContent));
			}
			builder.append("</tr>");
		}

		builder.append("</table>");
		return builder.toString();
	}
	
	
	public static String getValue(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("data.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String GenerateRandomNumber() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999999
		int rand_num = rand.nextInt(999999);

		return String.valueOf(rand_num);
	}
	public static String GenerateRandomDate() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999999
		int rand_num = rand.nextInt(30);

		return String.valueOf(rand_num);
	}

	public static String getDate_TestCase2A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2B(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2B.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static void scrollToElement(WebElement element, WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Wait.wait2Second();
	}
	public static String getFromTextProperties(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("text.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2G(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2G.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1L(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_L.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1O(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1O.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_G(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_G.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_H(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_H.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_K(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_K.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_M(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_M.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_N(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_N.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_I(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_I.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase39(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_39.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase18(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_18.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase22(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_22.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase29(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_29.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase38(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_38.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase184(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_184.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase179(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_179.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_C(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_C.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase180(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_180.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase181(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_181.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase182(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_182.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase77(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_77.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase87(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_87.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase153(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_153.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase162(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_162.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase171(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_171.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase177(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_177.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_B(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_B.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_C(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_C.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_98(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase_98.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_34(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase_34.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_175(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_175.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase_F004(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase_F004.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_48(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_48.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_19(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_19.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_44(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_44.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_43(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_43.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_113(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_113.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_120(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_120.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_129(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_129.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_135(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_135.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_46(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_46.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_56(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_56.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_Mini_Audit(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("mini_audit.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	
	
}
