package Selenium_pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_NG_pgm {
@Test
	public  void flip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver_s/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public  void Amazon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver_s/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		driver.close();
	}
}
