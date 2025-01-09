package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.setProperty("webDriver.chrome.driver", "/Users/SDET/Documents/chromedriver");
		WebDriver Driver =new ChromeDriver();
		
		/*通常操作
		Driver.get("http://rahulshettyacademy.com/locatorspractice/");	
		Driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		Driver.findElement(By.className("signInBtn")).click();
		*/
		
		//CSSの場合
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.get("http://rahulshettyacademy.com/locatorspractice/");	
		Driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		Driver.findElement(By.className("signInBtn")).click();
		System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		//ページのアニメーションが終わるのを待つ
		
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@ras.com");
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		Driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		Driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Driver.findElement(By.cssSelector("form p")).getText();
		
		Driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		Driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.id("chkboxOne")).click();
		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		System.out.println(Driver.findElement(By.tagName("p")).getText());
		
		
		
		
		
	}

}
