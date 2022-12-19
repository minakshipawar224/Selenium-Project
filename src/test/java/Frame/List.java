package Frame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class List {public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Minakshi");
//Select s=new Select(driver.findElement(By.id("month")));
//xpath("//select[@id='month']")
//s.selectByVisibleText("Jan");

Actions act=new Actions(driver);
act.click(driver.findElement(By.id("month"))).perform();
for(int i=0;i<=6;i++) {
  act.sendKeys(Keys.ARROW_UP).perform();
  act.sendKeys(Keys.ENTER).perform();
//driver.close();
}}
}