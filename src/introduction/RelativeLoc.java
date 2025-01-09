package introduction;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelativeLoc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEdiBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println( driver.findElement(with(By.tagName("label")).above(nameEdiBox)).getText());
		WebElement dateofBiElement =driver.findElement(By.cssSelector("{for='dateofBirth'}"));
		driver.findElement(with(By.tagName("input")).below(dateofBiElement)).click();
		
		

	}

}
