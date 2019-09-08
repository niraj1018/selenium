import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();

		while (it.hasNext()) {
			String ChildWindow = it.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("test");
				System.out.println(driver.getTitle());
			}
		}
		
		driver.quit();
	}

}
