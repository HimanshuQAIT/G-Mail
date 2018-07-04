package com.qait.Mail.G_Mail;

//import java.awt.Window;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMail {

	WebDriver wd;

	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himanshusharma\\Documents\\Chrome1\\chromedriver.exe");
		wd = new ChromeDriver();

	}

	public void testOpenGmail() {
		wd.get("https://www.google.com/gmail/about/#");
	}

	public void checkMenuItemForWork() throws InterruptedException {
		wd.findElement(By.xpath("/html/body/nav/div/a[1]")).click();
		wd.navigate().back();
		Thread.sleep(2000);
	}
	
	public void checkMenuItemSignIn() throws InterruptedException {
		wd.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		wd.navigate().back();
		Thread.sleep(2000);
	}

	public void checkMenuItemCreateAnAccount() throws InterruptedException {
		wd.findElement(By.xpath("/html/body/nav/div/a[3]")).click();
		wd.navigate().back();
		Thread.sleep(2000);
	}

	
	
	public void enterFirstName() {
		wd.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Rakesh");

	}

	public void enterLastName() {
		wd.findElement(By.id("lastName")).sendKeys("Kumar");

	}

	public void enterUsername() {
		wd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rakeshkumar00");
	}

	public void enterPassword() {
		wd.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("12345678");
	}

	public void enterConfirmPassword() {
		wd.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("12345678");
	}
}
