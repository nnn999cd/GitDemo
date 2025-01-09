package introduction;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.StructuredTaskScope.Subtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start']button"));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	
		WebElement fooElement =Wait.until(new function<WebDriver.WebElement>()
				{
			
			     Public WebElemet apply(webDriver driver) {
			    	 return driver.findElement(By.cssSelector("[id='finish']h4")).isDisplayed();
			     }
			
				}
	
	}

}
