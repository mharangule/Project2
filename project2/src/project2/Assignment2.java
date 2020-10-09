package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select s =new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		Select s1 =new Select(driver.findElement(By.id("Childrens")));
		s1.selectByVisibleText("3");
		Select s2=new Select(driver.findElement(By.id("Infants")));
		s2.selectByIndex(2);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		
		//below 2 line of code is to select class of travel which is not part assignment
		Select s3=new Select(driver.findElement(By.id("Class")));
		s3.selectByValue("First");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		

	}

}
