package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for*='friendsandfamily']")).getText());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//to get count of checkboxes present on webpage
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
