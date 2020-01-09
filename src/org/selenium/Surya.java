package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Surya {
	
	public static void main(String []args){
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/)");
		WebElement s=driver.findElement(By.xpath("/html/body/div[1]/section/div/ul/li[2]/"));
		Actions acc=new Actions(driver);
		acc.moveToElement(s).perform();}

	}
		
		
		


