package TestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActionTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.opencart.com/");
		WebElement menu=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[3]"));
		WebElement menuItem=driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]"));
		actions.moveToElement(menu).click(menuItem).build().perform();
		
		WebElement SrcBox=driver.findElement(By.xpath("//input[@name='search']"));
		SrcBox.sendKeys("phone");
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File SrcFile= screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("D:\\Screenshot\\FullScreen.png"));
		WebElement addToCart= driver.findElement(By.xpath("(//button[@aria-label='Add to Cart'])[1]"));
		File eleFile=addToCart.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(eleFile, new File("D:\\Screenshot\\NewScreen.png"));

		
		
//		//actions.contextClick(SrcBox).perform();
//		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//		Thread.sleep(1000);
//		WebElement Dblbtn=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
//		actions.doubleClick(Dblbtn).doubleClick(Dblbtn).build().perform();
//		
	}
}
