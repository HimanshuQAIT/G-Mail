package com.qait.Mail.G_Mail;

import org.testng.annotations.Test;

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
		public void CheckMenuItemForWork() {
			tat.checkMenuItemForWork();
			tat.checkMenuItemSignIn();
			tat.checkMenuItemCreateAnAccount();
			AssertJUnit.assertTrue(tat.wd.getCurrentUrl().contains("gmail"));
		}

		
  }

