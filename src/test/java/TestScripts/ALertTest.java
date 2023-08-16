package TestScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();
		System.out.println("From Simple alert..."+alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Alert confirm=driver.switchTo().alert();
		System.out.println("From Simple alert..."+confirm.getText());
		confirm.dismiss();
		

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert prompt=driver.switchTo().alert();
		System.out.println("From Simple alert..."+prompt.getText());
		prompt.sendKeys("Hello");
		prompt.accept();
		
	}

}
