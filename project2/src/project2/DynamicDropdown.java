package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(20000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		
		//line no. 20 is replacement for line no. 19 
		//line 20 is parent child relationship xpath
		//working in FF not in chrome

	}

}
