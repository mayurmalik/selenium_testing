package com.test.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_package.Thread_local_driversetup;

public class Amazon_add_cart_objects {

	private WebDriver driver;
	Actions act;
	WebDriverWait wait;

	// Constructor, as every page needs a Webdriver to find elements

	public Amazon_add_cart_objects(WebDriver driver) {
		this.driver = driver;
		wait= new WebDriverWait(driver, 20);
		act = new Actions(driver);

	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;

	@FindBy(id = "nav-search-submit-button")
	WebElement submitButton;

	@FindBy(xpath = "(//*[@class='a-link-normal s-navigation-item'])[2]/span")
	WebElement secondLink;

	@FindBy(xpath = "(//*[@class='a-link-normal a-text-normal'])[1]")
	WebElement selectFirstProduct;

	@FindBy(xpath = "//*[@title='Add to Shopping Cart']")
	WebElement Addtocart;

	@FindBy(xpath = "//*[text()[contains(.,'Proceed to checkout')]]")
	WebElement proceedCheckout;

	public Amazon_add_cart_objects enterProductSearchDetailsAndClick(String productname, String data2) {
		searchbox.click();
		searchbox.sendKeys(productname);
		submitButton.click();
		return this;
	}

	public Amazon_add_cart_objects clickOnDesiredLinkAndSelectProduct() throws InterruptedException {
		secondLink.click();

		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(selectFirstProduct)).click();
		return this;
	}

	public Amazon_add_cart_objects addProductToCartAndCheckout() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Addtocart)).click();

		Thread.sleep(2000);
		act.moveToElement(proceedCheckout).click();
		return this;
	}

}
