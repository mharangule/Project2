package project2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("united arab emirates"))
			{
				option.click();
				break;
			}
				
		}
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		String script="return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);*/
		
		//either you can use Javascript Executor or you can use  step no. 42
		String text=driver.findElement(By.id("autocomplete")).getAttribute("value");
		
		System.out.println(text);
		if(text.equalsIgnoreCase("united arab emirates"))
			System.out.println("verified");
		else
			System.out.println("Not verified");

	}

}
