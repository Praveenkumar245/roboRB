package org.ggle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Googlee {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\RobotClass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	WebElement selectOption = driver.findElement(By.id("cars"));
	Select select = new Select(selectOption);
	select.selectByVisibleText("Volvo");
	
	//WebElement enterName = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	//enterName.sendKeys("VelMurugan");
	//Actions ac = new Actions(driver);
	//ac.doubleClick(enterName).perform();
	
	//Robot rb = new Robot();
	//rb.keyPress(KeyEvent.VK_CONTROL);rb.keyPress(KeyEvent.VK_X);
	//rb.keyRelease(KeyEvent.VK_X);rb.keyRelease(KeyEvent.VK_CONTROL);

	
	


	
}
}
