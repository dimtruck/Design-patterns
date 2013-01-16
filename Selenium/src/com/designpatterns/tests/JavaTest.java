package com.designpatterns.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.designpatterns.common.IndexPage;

public class JavaTest {

	private final WebDriver driver = new FirefoxDriver();
	private IndexPage page;
	
	@Test
	public void java_page_test(){
		this.page = new IndexPage(driver);
		this.page.navigateToJavaPage();
		Assert.assertTrue(driver.findElements(By.tagName("h2")).size() == 2);
		Assert.assertTrue(driver.findElements(By.className("title")).size() == 12);
		Assert.assertTrue(driver.findElements(By.className("title")).get(0).getText().equals("WHAT IT IS:"));
		Assert.assertTrue(driver.findElements(By.className("title")).get(1).getText().equals("WHEN SHOULD I USE IT:"));
		this.page.finish();
	}
}
