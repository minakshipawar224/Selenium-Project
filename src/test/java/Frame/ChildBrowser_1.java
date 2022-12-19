package Frame;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_1 {
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
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(ids);
		String idOfMainBrowser=al.get(0);
		String idOfChildBrowser=al.get(1);
		Thread.sleep(2000);

		System.out.println("Main browser:"+idOfMainBrowser); //al.get(0)
		System.out.println("child browser:"+idOfChildBrowser); //al.get(1)
		driver.switchTo().window(idOfChildBrowser);
		
		
}
}