package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox= driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		Thread.sleep(2000);
		List<WebElement> items=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println(items.size());
		for (int i=0;i<items.size();i++) {
			if(items.get(i).getText().equalsIgnoreCase("Java Tutorial Pdf")) {
				items.get(i).click();
				break;
			}
		}
		
//		srcBox.sendKeys(Keys.ENTER);
		String PageTitle= driver.getTitle();
		System.out.println("Page Title....."+PageTitle);
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.close();
		
		
	}

}