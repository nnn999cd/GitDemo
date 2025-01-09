package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text="Rahul";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
