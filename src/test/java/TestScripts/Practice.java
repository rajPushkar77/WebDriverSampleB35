package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.lambdatest.com/blog/");
//		driver.findElement(By.xpath("//div[@class='dropdown rs-dropdown dropdown_blog item_link'][4]")).click();
//		Thread.sleep(5000);
//		driver.close();
		
		
		driver.navigate().to("https://accounts.lambdatest.com/register");
		driver.findElement(By.xpath("//button[contains(text(),'SIGN UP')]")).click();
		String Text=driver.findElement(By.xpath("//p[text()='Please enter your email address']")).getText();
		String Text1=driver.findElement(By.xpath("//p[contains(text(),'Please enter a desired password')]")).getText();
		System.out.println(Text);
		System.out.println(Text1);
		Thread.sleep(5000);
		driver.close();
	}

}