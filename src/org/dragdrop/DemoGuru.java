package org.dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\DragAndDrop\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement dragBank = driver.findElement(By.id("credit2"));
	
		WebElement dropBank = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(dragBank, dropBank).perform();
				
		WebElement drag5000 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		
		WebElement drop5000 = driver.findElement(By.id("amt7"));
		
		actions.dragAndDrop(drag5000, drop5000).perform();
		
		WebElement dragSales = driver.findElement(By.id("credit1"));
		
		WebElement dropSales = driver.findElement(By.id("loan"));
		
		actions.dragAndDrop(dragSales, dropSales).perform();
		
		WebElement dragS000 = driver.findElement(By.xpath("(//li[@data-id='2'])[2]"));
		
		WebElement dropS000 = driver.findElement(By.id("amt8"));
		
		actions.dragAndDrop(dragS000, dropS000).perform();
		
		WebElement btnPerfct = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		btnPerfct.click();
	}
	
}
