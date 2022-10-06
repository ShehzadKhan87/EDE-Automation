package gettoken_fromurl;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetUrl {
	@Test
	public void getUrl() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://10.20.30.66:8070/formconsumerlogin.aspx?Reason=None");
		Thread.sleep(5000);
		WebElement userElement=driver.findElement(By.xpath("//input[@title='User Name']"));
		userElement.clear();
		userElement.sendKeys("grandjh1@test.com");
		Thread.sleep(2000);
		WebElement passElement=driver.findElement(By.xpath("(//input[@title='Password'])[2]"));
		passElement.clear();
		passElement.sendKeys("Pass@word1");
		Thread.sleep(2000);
		WebElement singInButton=driver.findElement(By.xpath("//input[@value='Sign in']"));
		singInButton.click();
		Thread.sleep(20000);
		ArrayList<String> getUrls=new ArrayList<String>();
		
		for(int  i=0;i<1000;i++) {
			String url=driver.getCurrentUrl();
			getUrls.add(url);
		}
		for(int i=0;i<getUrls.size();i++) {
			System.out.println(getUrls.get(i));
		}
		//driver.close();
		
	}
	

}
