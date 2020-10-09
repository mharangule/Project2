package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {
	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		String s="Mahesh";
		driver.findElement(By.cssSelector("input[id='name'")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
