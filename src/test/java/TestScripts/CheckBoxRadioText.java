package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		WebElement Checkbox=driver.findElement(By.xpath("//input[@class='cb1-element']//following::input"));
//		if(!Checkbox.isSelected()) {
//			Checkbox.click();
//		}
		
		driver.navigate().to("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='5 - 15']"));
		radio.click();
		
	}

}
