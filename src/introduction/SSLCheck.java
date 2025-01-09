package introduction;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//https://expired.badssl.com
		
		
		
		
		ChromeOptions options =new ChromeOptions();//拡張機能やhttpsを所持していないサイトにアクセスするときに使用
		options.setAcceptInsecureCerts(true);//オプション内容は必ずドライバーの生成前に記載すること
		Proxy proxy =new Proxy();
		
		
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		WebDriver driver =new ChromeDriver(options);
		
		
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
		
		

	}

}
