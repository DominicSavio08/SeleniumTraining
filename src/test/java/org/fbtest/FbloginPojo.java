package org.fbtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPojo extends BaseClassCopy{
	
	public FbloginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='royal_login_button']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	

}
