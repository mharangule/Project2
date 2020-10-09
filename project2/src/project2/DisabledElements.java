package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(30000);
		
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("0"))
			System.out.println("Element is Disabled");
		else
			System.out.println("Element is Enabled");
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1"))
			System.out.println("Element is Enabled");
		else
			System.out.println("Element is Disabled");
		//First need to check which attribute is changing while enabling and disabling UI Element
	}

}
