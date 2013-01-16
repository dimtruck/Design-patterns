package com.designpatterns.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage {
	private WebDriver driver;
	
	public IndexPage(WebDriver driver){
		this.driver = driver;
		driver.get("http://localhost:8080");
		if(!driver.getTitle().equals("Design Patterns"))
			throw new IllegalStateException("was unable to get to home page. Currently here: " + driver.getCurrentUrl());
	}
	
	public LanguagePage navigateToJavaPage(){
		driver.findElement(By.linkText("Java Patterns")).click();
		LanguagePage page = 
				(new WebDriverWait(driver, 10)).until(new ExpectedCondition<LanguagePage>() {
		            public LanguagePage apply(WebDriver d) {
		                return new LanguagePage(d,"Java");
		            }
		        });
		return page;
	}
	
	public void finish(){
		this.driver.quit();
	}
}