package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung tv");
		Thread.sleep(2000);
		String ext = "samsung tv";

		/*List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		for (WebElement option : alloptions) {
			String act = option.getText();
			if (act.contains(ext)) {
				//option.click();
				
			}*/
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//}

	driver.findElement(By.xpath("//div[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
          Thread.sleep(4000);
          
		/*
		 * //driver.findElement(By.
		 * xpath("(//a[@class='a-link-normal a-text-normal'])[3]")).click();
		 * Thread.sleep(2000);
		 * 
		 * Set<String> ids = driver.getWindowHandles(); ArrayList<String> al = new
		 * ArrayList<String>(ids); String childWindow = al.get(0);
		 * driver.switchTo().window(childWindow);
		 * driver.findElement(By.id("add-to-cart-button")).click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
          Set<String> totalWindows=driver.getWindowHandles();
          List<String> totalWindowsList = new ArrayList(totalWindows);
          driver.switchTo().window(totalWindowsList.get(1));
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
driver.findElement(By.xpath("//div[@id='attach-added-to-cart-message']/div/div[2]/div[3]/span/span")).click();
		}
}