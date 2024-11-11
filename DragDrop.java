package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                                                                                                                                          
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			
			WebElement f1= driver.findElement(By.xpath("//iframe[contains(@src, 'droppable')]"));
			driver.switchTo().frame(f1);
			
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			
			Actions a = new Actions(driver);
			a.dragAndDrop(drag, drop);

	}

}
