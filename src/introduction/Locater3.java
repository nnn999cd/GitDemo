package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.base.StandardSystemProperty;

public class Locater3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.setProperty("webDriver.chrome.driver", "/Users/SDET/Documents/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		

	}

}
