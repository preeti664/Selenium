package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/radio.html");
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));
		
//		  for (int i=0; i<2; i++) {											
//			  check.click (); 	}		
//	            System.out.println("Persists Checkbox Status is -  "+check.isSelected());	
//		for(WebElement cbox:check)
//		{
//			cbox.click();
//			if(cbox.isSelected())
//				System.out.println("selected");
//			else
////				System.out.println("not selected");
//		}
//		
		for(int i=0; i<2;i++)
		{
			check.get(i).click();
		}
	
	}
		
	
		  


	}


