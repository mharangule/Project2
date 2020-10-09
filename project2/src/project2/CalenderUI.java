package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id*='view_date1']")).click();
		WebElement element=driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"));
		element.click();
		//System.out.println(element.getText());
		//for selecting current date
		//when we have class name as unique attribute we can use only class name as css selector
		//but need to remove spaces in class name by .(dot) and applying .(dot) before class name as in line 
		//in case of id we need to use '#' before is to form a cssSelector
	}

}
