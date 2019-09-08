import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
	// new stage
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/");
		
		WebElement element = driver.findElement(By.name("bdaytime"));
		element.sendKeys("09092019");
		element.sendKeys(Keys.TAB);
		element.sendKeys("1125PM");
	}
}
