package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select SigSel=new Select(driver.findElement(By.id("select-demo")));
		SigSel.selectByIndex(1);
	}

}
