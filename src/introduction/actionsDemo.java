package introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//System.setProperty("webDriver.chrome.driver", "/Users/SDET/Documents/chromedriver");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		a.moveToElement(move).build().perform();
		
		//a.moveToElement(move).clickAndHold();
		//driver.findElement(By.cssSelector(""))
		
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		
		

	}

}
