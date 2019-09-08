import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	
	Select v = new Select(driver.findElement(By.name("country")));
	
//	v.selectByIndex(2);
//	v.selectByValue("BARBADOS");
	
	v.selectByVisibleText("BANGLADESH");
	
	
	
	
}
}
