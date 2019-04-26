package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prg1 {
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupesh Kumar D\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.close();
	}

}
