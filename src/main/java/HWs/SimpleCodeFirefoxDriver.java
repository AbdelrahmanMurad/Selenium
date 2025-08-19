package HWs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleCodeFirefoxDriver {

	public static void main(String[] args) {
		// Setup ChromeDriver automatically with WebDriverManager
		WebDriverManager.firefoxdriver().setup();

		// Instantiate the driver
		WebDriver driver = new FirefoxDriver();

		// Launch website
		driver.get("https://www.udemy.com/");
	}
}