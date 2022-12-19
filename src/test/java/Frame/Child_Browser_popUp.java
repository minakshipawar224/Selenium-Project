package Frame;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_popUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		String mainstr=driver.getTitle();
		System.out.println(mainstr);
		String firstWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows);
		String window = null;
		driver.switchTo().window(window);
		String str=driver.getTitle();
		System.out.println(str);
		if(driver.getTitle().equals("Browser Windows")) {
			driver.close();
		}
		driver.switchTo().window(firstWindow);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
}
}