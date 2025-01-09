package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selintroduction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Invoking browser(ブラウザの起動)
		//Chrome - ChromeDriver -＞Methods
		//ChromeDiver methods + class methods
		
		//step to invorke chrome driver
		//selenium mabager
		//System.setProperty("webdrivser.chrome.driver","/Users/DET/Documents/chomedriver");//（）2個目は「chromeDribver DL]で検索して互換性のあるバージョンを指定しなければならない
		//WebDriver driver =new ChromeDriver();
		
		
		
		//Firefox Launch
		//webdriver.gecko.driver
		//System.setProperty("webdrivser.gecko.driver","/Users/DET/Documents/geckodriver");
		//WebDriver driver =new FirefoxDriver();
		
		//MSEdge
		System.setProperty("webdrivser.edge.driver","/Users/DET/Documents/msedgedriver");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096188#questions");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
