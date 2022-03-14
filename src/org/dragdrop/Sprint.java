package org.dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\DragAndDrop\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		
		driver.manage().window().maximize();
		
		WebElement lnkPhde = driver.findElement(By.xpath("//a[text()=' Phones & devices ']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(lnkPhde).perform();
		
		WebElement lnk5g = driver.findElement(By.xpath("//span[text()='5G phones']"));
		
		actions.moveToElement(lnk5g).perform();

		lnk5g.click();
		
		WebElement txtPrint = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		
		Thread.sleep(3000);
		
		String print = txtPrint.getText();
		
		System.out.println(print);
		
		
		
	
	}
}
