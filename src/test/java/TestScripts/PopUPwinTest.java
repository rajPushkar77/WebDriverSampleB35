package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUPwinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions options= new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String ParentWin= driver.getWindowHandle();
		System.out.println("Parent Window...."+ParentWin);
		driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
		Set<String> wins=driver.getWindowHandles();
		System.out.println("No of windows...."+wins.size());
		
		for(String tab:wins) {
			System.out.println(tab);
			if (!tab.equalsIgnoreCase(ParentWin)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
				
			}
		}
		driver.close();
		driver.switchTo().window(ParentWin);
		driver.findElement(By.xpath("//button[contains(text(),' Click to open new Window ')]")).click();
		//driver.quit();
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/blog/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
