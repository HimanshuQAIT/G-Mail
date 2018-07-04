package com.qait.Mail.G_Mail;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;

public class TestMail {
 // @Test
	MainMail tat = new MainMail();
	
  @BeforeTest
  //public void beforeTest() {
	  
	  public void InitializeBrowser() {
			tat.initializeBrowser();
		}

		@Test(priority = 0)
		public void TestOpenGmail() {
			tat.testOpenGmail();
			AssertJUnit.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		}

		@Test(priority = 1)
		public void CheckMenuItemGmail() throws InterruptedException {
			tat.checkMenuItemForWork();
			tat.checkMenuItemSignIn();
			tat.checkMenuItemCreateAnAccount();
			//
			AssertJUnit.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
			Thread.sleep(2000);
		}
		
		@Test(priority = 2)
		public void EnterFirstName() {
			tat.enterFirstName();
			
			Assert.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		}
        
		@Test(priority = 3)
		public void EnterLastName() {
			tat.enterLastName();
			Assert.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		
		}
		
		@Test(priority = 4)
		public void EnterUsername() {
			tat.enterUsername();
			Assert.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		}
		
		@Test(priority = 5)
		public void EnterPassword() {
			tat.enterPassword();
			Assert.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		}
		
  }

