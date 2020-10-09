package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(20000);
		
		
		
		//select origin and destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		
		
		
	    //select date
		driver.findElement(By.cssSelector("input[id*='view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		
		//select Checkboxes
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	
		//selct Passenger details
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Select s1 =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByVisibleText("2");
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s2.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
		//

	}

}
