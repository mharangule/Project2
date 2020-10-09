package project2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.xpath("//div[@id='link']/div/ul/li/a")).click();
		driver.navigate().back();*/
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		WebElement e=driver.findElement(By.cssSelector("//input[@id='travel_date']"));
		while(!e.getText().contains("October"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		System.out.println(count);
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
