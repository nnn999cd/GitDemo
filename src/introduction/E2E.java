package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("ui-datepicker.ui-widget ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{


		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		

	}

}
