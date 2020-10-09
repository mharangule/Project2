package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("mahesh.harangule.3@facebook.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("22748081");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		driver.findElement(By.cssSelector("img[class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']")).click();
		
		Thread.sleep(120000);
		driver.quit();
		
	}

}
