package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//兄弟層がたくさんある場合のCSS　　.tableFixHead td:nth-child(4)
		
		List<WebElement>valuse= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		
		
		for(int i=0;i<valuse.size();i++)
		{
			sum=sum+ Integer.parseInt(valuse.get(i).getText());
		}
		
		System.out.println(sum);
		driver.findElement(By.cssSelector("totalAmount")).getText();
		int total= Integer.parseInt(driver.findElement(By.cssSelector("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);

	}

}
