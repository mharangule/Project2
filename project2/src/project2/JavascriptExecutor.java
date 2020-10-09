package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  /*this is Implicit Wait */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("beng");
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(driver.findElement(By.cssSelector("#fromPlaceName")).getText());
		//selenium cannot identify hidden elements
		
		//solution for this is Javascript DOM
		//JavascriptExecutor helps us in this to find the hidden elements
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int count=1;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{	
			count++;
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(count>4)
				break;
		}
		if(count>4)
			System.out.println("No match found");
		else
			System.out.println("match found");
		
	}

}
