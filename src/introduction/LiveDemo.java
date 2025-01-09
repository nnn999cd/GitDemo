package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		WebDriver driver=new ChromeDriver();
		
		//すべてのウェブの要素のテキストを、キーボード・クリック操作で新しいリストに呼び込む
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList =driver.findElements(By.xpath("//tr/th[1]"));
		
		//elementList.stream().map(mapper).:mapで繰り返し要素を取得する？
		
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sorted();で取得した要素をソートして並びかえる
		List<String>soretedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(soretedList));


		//名前をスキャンしてカラムに入れ、値段を表示

		// price=elementList.stream().filter(s->s.getText().contains("Rice")).
				// map(s->getPriceVaggie(s)).collect(Collectors.toList());
	}

		 

		 
		 
}
