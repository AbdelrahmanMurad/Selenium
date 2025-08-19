import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloSelenium {

	public static void main(String[] args) {
		// Setup ChromeDriver automatically with WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Instantiate the driver
		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.get("https://www.google.com/");
	}
}