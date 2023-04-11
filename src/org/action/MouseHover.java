package org.action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\SeleniumMouseHover\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
Thread.sleep(3000);
	WebElement close = driver.findElement(By.xpath("//button[text()='×']"));
	close.click();
	Thread.sleep(3000);
	WebElement coures = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions action = new Actions(driver);
	action.moveToElement(coures).perform();
	WebElement auto = driver.findElement(By.xpath("//span[text()='Robotic Process Automation Training']"));
	action.moveToElement(auto).perform();
	WebElement blue = driver.findElement(By.xpath("//span[text()='Blue Prism Training']"));
	blue.click();
	
	}

		
	}


