package project2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExpleoAutomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://expleogroup.com/");
		WebElement link=driver.findElement(By.xpath("//li[@id='menu-item-1162']/a"));
		Actions action = new Actions(driver);
		action.moveToElement(link).build().perform();
		driver.findElement(By.xpath("//li[@id='menu-item-1176'] //a")).click();
		driver.findElement(By.id("country")).click();
		Select s =new Select(driver.findElement(By.id("country")));
		s.selectByVisibleText("India");
		driver.findElement(By.cssSelector("button[onclick='return gotojobsite()']")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> itr =windows.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#icims_content_iframe")));
		WebElement element=driver.findElement(By.cssSelector("#jsb_f_keywords_i"));
		element.sendKeys("Quality");
		WebElement category=driver.findElement(By.cssSelector("#jsb_f_position_s"));
		category.click();
		Select s1=new Select(category);
		s1.selectByVisibleText("Quality Assurance");
		WebElement location=driver.findElement(By.cssSelector("#jsb_f_location_s"));
		location.click();
		Select s2=new Select(location);
		s2.selectByVisibleText("IN-MH-Pune");
		WebElement button=driver.findElement(By.cssSelector("#jsb_form_submit_i"));
		button.click();
		System.out.println(driver.findElement(By.xpath("//div[@tabindex='-1'] //h1")).getText());
		driver.switchTo().window(parent);
	}

}
