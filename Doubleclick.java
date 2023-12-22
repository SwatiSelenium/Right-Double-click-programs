package Rightclick;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick 
{
	@Test
	public void doubleclick1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		Actions a1 = new Actions(driver);
		
		a1.doubleClick(mob).perform();
	
	}
}
