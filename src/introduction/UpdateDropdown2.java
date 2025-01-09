package introduction;

//import java.awt.im.InputContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//CSSセレクターなら以下のようにフルパスではなく要点をストレートに書くことができる（’’の部分）
		
		driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).click();
		
		//チェックボックスがチェックされているかを確認することができるメソッド：isSelected()
		
		driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected();
		
		System.out.println(driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

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