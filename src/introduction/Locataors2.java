package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locataors2 {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		String name = "rahul";

		System.setProperty("webDriver.chrome.driver", "/Users/SDET/Documents/chromedriver");
		WebDriver driver =new ChromeDriver();

		// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		// WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//String password = getPassword(driver);
		
		String password=getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("ruhul");

		driver.findElement(By.name("inputPassword")).sendKeys("password");

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+name+",");
	
	    driver.findElement(By.cssSelector("//*[text()='LOG Out']")).click();
	    driver.close();
	}
	
	
	public String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("from p")).getText();
		String [] passwordAarry =passwordText.split("'");
		String password=passwordAarry[1].split("'")[0];
		return password;
		
	}

}
