package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToFrameUsingName {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	//"iframeResult"- by name
	//"iframeResult"- by id
	//1- by index
	
	//click to any web element on the page
	driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
	
	//switch to parent frame
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	//perform some action on parent frame
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
}
}