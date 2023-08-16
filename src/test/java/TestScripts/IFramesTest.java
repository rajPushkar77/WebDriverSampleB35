package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strltl= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strltl);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		
		//frame1 to frame3(nested frame)
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();	
		
		
		//frame 3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		
		
		//frame1 to mainpage
		
		driver.switchTo().defaultContent();
		String strlt1= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strlt1);
		
		
	}

}
