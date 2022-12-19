package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung tv");
	Thread.sleep(2000);
	//String exp = "samsung tv";
	//exp.click();
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));
	
	for(int i=0; i<elements.size(); i++) {
		System.out.println(elements.get(i).getText());
	}
	
	try {
		System.out.println("abcd");
	}
	
	finally {
		System.out.println("mnbv");
	}
	
	}}