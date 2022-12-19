package Demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFinding {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("boat smartwatch");

	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));
	
	for(int i =0; i<list.size(); i++) {
		if((list.get(i).getText()).contentEquals("boat smartwatch for men") ) {
			list.get(i).click();
		}
	}
	
	
}
}
