package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//ul[@class='list-inline'])[2]//li[2]//div//a/span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-right show'])//a[contains(text(),'Register')]")).click();
		String PageTitle=driver.getTitle();
		System.out.println("Registration Page Title..."+PageTitle);
		driver.findElement(By.xpath("//input[@id='input-firstname' and @type='text']")).sendKeys("Pushkar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name' and @type='text']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='email' and @id='input-email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='password' and @id='input-password']")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@type='radio' and @id='input-newsletter-no']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
