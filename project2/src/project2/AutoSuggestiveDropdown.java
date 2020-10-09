package project2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("rus");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("Russian Federation"))
			{
				option.click();
				break;
			}
				
		}
		// working only in chrome
				
	}

}
