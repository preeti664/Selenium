package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement f1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(f1);//switch to frame
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Yellow");
		
		driver.switchTo().defaultContent();
		//frame3
		
		WebElement f3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(f3);//switch to frame
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("blue");
	
		//inner iframe
//		WebElement inner = driver.findElement(By.xpath("//div[@class='m7w29c O8VmIc tIvQIf']"));
//		driver.switchTo().frame(inner);//switch to frame	

//		driver.switchTo().frame(0);
//		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='rseUEf nQOrEb']")).click();
//		WebElement button= driver.findElement(By.xpath("//div[@id='i8']//div[@class='rseUEf nQOrEb']"));
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arugument[0].click()", button);
//		driver.switchTo().defaultContent();
		
		int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();}
		
	}

}
