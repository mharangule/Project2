package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		
		WebElement e1=driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']"));
		e1.click();
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_0']")).getText());
		
		WebElement e2=driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']"));
		e2.click();
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_1']")).getText());
		
		WebElement e3=driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_2']"));
		e3.click();
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_2']")).getText());
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a[id='MultiCityModelAlert']")).click();
	}

}
