package project2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderUI2 { 

	public static void main(String[] args) {    //sometime working sometime not
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.path2usa.com/travel-companions");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='travel_date']")));
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		WebElement e=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		while(!e.getText().contains("May"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("19"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}
}


