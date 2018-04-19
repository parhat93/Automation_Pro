package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class Homepage {
	public Homepage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(linkText="Gmail")
	public WebElement gmail;
	
	
	@FindBy(linkText="CREATE AN ACCOUNT")
	public WebElement createAnAccount;
	
	
}
