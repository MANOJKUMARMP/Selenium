package Selenium_pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver_s/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}

}
