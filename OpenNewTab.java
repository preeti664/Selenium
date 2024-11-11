package practices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	WebElement link =driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
	
	Actions a = new Actions(driver);
	
	a.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
	
	//move to home page
	
	List<String> ids = new ArrayList(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1));
	
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
			search.sendKeys("Samsung");
			search.click();
			
			
			driver.switchTo().window(ids.get(0));
		
	}

}
