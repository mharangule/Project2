package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Mahi");
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("Mahesh Harangule");
		//driver.findElement(By.name("btnK")).click();  
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("This is a link")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\'link\']/div/ul/li[5]/a")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getText());
	}

}
