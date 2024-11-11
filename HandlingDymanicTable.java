package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDymanicTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("demoadmin");
		driver.findElement(By.id("input-password")).sendKeys("demopass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		
		//page number
		String num =driver.findElement(By.xpath("//div[contains(text(), 'Pages'])")).getText();
		
		int totalPage = Integer.parseInt(num.substring(num.indexOf("(")+1, num.indexOf("Pages")-1));
		
		for(int i=1; i<=totalPage; i++) {
			if(i>1) {
				WebElement allPages = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='\" + p + \"']"));
				allPages.click();
			}
		}
				
		
		
	}

}
