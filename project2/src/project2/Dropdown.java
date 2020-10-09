package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		/*Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByIndex(2);
		s.selectByValue("option1");*/
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Select s1 =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByVisibleText("3");
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s2.selectByIndex(2);
		
		
		}

}
