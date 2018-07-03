package com.qait.Mail.G_Mail;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

	public void checkMenuItemForWork() {
		wd.findElement(By.xpath("/html/body/nav/div/a[1]")).click();
		wd.navigate().back();
	}

	public void checkMenuItemCreateAnAccount() {
		wd.findElement(By.xpath("/html/body/nav/div/a[3]")).click();
		wd.navigate().back();
	}

	public void checkMenuItemSignIn() {
		wd.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		wd.navigate().back();
	}

}
