package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		WebElement closeIcon=driver.findElement(By.cssSelector("a[title='Clear text']"));
		
		if (closeIcon.isDisplayed()) {
			closeIcon.click();
			System.out.println("WebElement found");
		}else {
			System.out.println("WebElement not found");
		}
	}

}
