package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestiveDropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  /*this is Implicit Wait */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("mum");
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		driver.findElement(By.cssSelector("label[for='toCity']")).click();
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("del");
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
			
	}
}