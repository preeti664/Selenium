package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='country']"))	;
		
		Select drpdown = new Select(drp);
		//drpdown.selectByVisibleText("Brazil");
		//drpdown.selectByValue("japan");
		drpdown.selectByIndex(0);
		
		List<WebElement> op = drpdown.getOptions();
		
	
		System.out.println(op.size());
		
		for(WebElement op1:op)
		{
			System.out.println(op1.getText());
		}
		

	}

}
