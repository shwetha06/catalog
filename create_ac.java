package Com.swetha.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.swetha.com.CommonMethods;

		public class create_ac {
		 public WebDriver driver;
		public Com.jass.com.CommonMethods CM;
		
		@Test
		public void testcase01(String UserName) throws InterruptedException
		{
			By driver = null;
			driver.findElement((SearchContext) By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
			 Thread.sleep(3000);
		    System.out.println("click log your self link");
			driver.findElement((SearchContext) By.name("email_address")).sendKeys(UserName);
			System.out.println("enter the username");
		    driver.findElement((SearchContext) By.name("password")).sendKeys("shwethareddY");
		    System.out.println("Enter the password");
		    driver.findElement((SearchContext) By.xpath(".//*[@id='tdb5']/span[2]")).click();
		    System.out.println("Click the signin");
		    Thread.sleep(3000);
			String expectedText = "Welcome to iBusiness";
			System.out.println("expected output");
			String actualText = driver.findElement((SearchContext) By.xpath(".//*[@id='bodyContent']/h1")).getText();
			System.out.println("ExpectedText="+expectedText+"\n"+"ActualText="+actualText);
			driver.findElement((SearchContext) By.xpath(".//*[@id='tdb4']/span")).click();
			System.out.println("Click Log off");
		}
	}


