package com.test.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Egift_selection {
	
	private WebDriver driver;
	Actions act;
	WebDriverWait wait;

	
	 
	 //Constructor, as every page needs a Webdriver to find elements
	 public Egift_selection(WebDriver driver){
	 this.driver=driver;
	  act=new Actions(driver);
	 wait= new WebDriverWait(driver, 20);
	 
	 }
	 
	
	

	
	
	@FindBy(xpath = "//*[text()='Gift Cards']")
	WebElement giftcardlink;
	
	@FindBy(xpath = "//*[text()='Birthdays']")
	WebElement birthdaylink;
	
	@FindBy(xpath = "(//*[@class='a-button-text bxc-button-text '])[1]")
	WebElement egiftbutton;
	
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement firstegift;
	
	
	
	public Egift_selection egift_selection(String egift , String category) throws InterruptedException {
		
		
		
		Thread.sleep(7000);
		
		giftcardlink.click();
		act.moveToElement(giftcardlink).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(birthdaylink)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(egiftbutton)).click();
		
	if(firstegift.isDisplayed()) {
		
		System.out.println("working fine ");
		
		System.out.println("selected egift for " +egift + " is displayed " + category);
	}
	
	else {
		
		System.out.println("some issue in your code");
	}
		
	return this;
	}
	
	
	
}
