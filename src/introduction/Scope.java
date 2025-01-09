package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		//1.ページのリンク数を数える
		//2.フッターセレクションを数える
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.		//                                                            
		WebElement coloumndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/db[1]/ul"));
		
		
		System.out.println( coloumndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			//Iterator、
			while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
			//現在ウィンドウが存在するかを示す。
			
			
		}
		
		

}
}
