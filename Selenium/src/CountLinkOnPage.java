import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinkOnPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		ArrayList<WebElement>  links = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		for(int i =0 ;i<links.size();i++) {
		System.out.println(links.get(i).getText());
		}
	}

}
