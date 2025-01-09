package introduction;

//import java.awt.im.InputContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//CSSセレクターなら以下のようにフルパスではなく要点をストレートに書くことができる（’’の部分）
		
		driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).click();
		
		//チェックボックスがチェックされているかを確認することができるメソッド：isSelected()
		
		driver.findElement(By.cssSelector("Input[id*='SeniorCitizenDiscount']")).isSelected();
		
		//チェックボックスの数を数えるメソッド（使うには全ボックス共通のロケーターを明記する：size()
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		//driver.findElement(By.id("btnclosepaxoption"));
		
		//driver.findElement(By.id("hrefIncAdt")).click();
		
	//	int i=1;
//		while(i<5)
		for(int i=1;i<5;i++)
		{
			//クリック処理を繰り返すために使う、（）がTureのため、Falese判定でループ抜ける
			
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		

		
	}

}
