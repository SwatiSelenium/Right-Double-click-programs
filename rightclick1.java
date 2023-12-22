package Rightclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightclick1 
{
	@Test
	public void rightclickmethod() throws AWTException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		Actions a1 = new Actions(driver);
		a1.contextClick(mob).perform();
		
		
		// Q can be asked - how to open browser in incognito mode - ans using robot class
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER); // Incognito mode enter
		
	}
}
