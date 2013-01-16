package com.designpatterns.common;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class LanguagePage {
	private WebDriver driver;
	
	public LanguagePage(WebDriver driver, String pageTitle){
		this.driver = driver;
		if(!driver.getTitle().equals(pageTitle))
			throw new IllegalStateException("was unable to navigate to correct page. Currently here: " + driver.getCurrentUrl());
	}
}
