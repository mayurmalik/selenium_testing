package com.test.com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base_package.Thread_local_driversetup;

import utils.GetDataFromExcel;

public class Runner_class {



	@BeforeMethod
	/*
	 * Method to instantiate local driver instance for each method Get driver from
	 * driver setup and set it for local execution
	 */
	public void setUpBrowser() {
		Thread_local_driversetup webDriverFactory = new Thread_local_driversetup();
		webDriverFactory.setDriver();
		
		Thread_local_driversetup.getDriver().get("https://www.amazon.com/");
		Thread_local_driversetup.getDriver().manage().window().maximize();
		System.out.println("before method driver value" + Thread_local_driversetup.getDriver());

	}

	@Test(dataProvider = "Amazonadd_cart")
	/*
	 * Add item to cart method
	 * 
	 * @Params: productname
	 * 
	 * @Param: data2
	 */
	public void AddToCart(String productname, String data2) throws InterruptedException {

		System.out.println("test method driver value" + Thread_local_driversetup.getDriver());

		Amazon_add_cart_objects addcart = PageFactory.initElements(Thread_local_driversetup.getDriver(), Amazon_add_cart_objects.class);

		addcart.enterProductSearchDetailsAndClick(productname, data2).
		clickOnDesiredLinkAndSelectProduct().addProductToCartAndCheckout();

	}

	@Test(dataProvider = "egift_selection")
	/*
	 * Add egift card method
	 * 
	 * @Params: egift(String)
	 * 
	 * @Param: category(String)
	 */
	public void efigt_select(String egift, String category) throws InterruptedException {

		System.out.println("test method driver value" + Thread_local_driversetup.getDriver());

		Egift_selection egift2 = PageFactory.initElements(Thread_local_driversetup.getDriver(), Egift_selection.class);

		egift2.egift_selection(egift, category);

	}

	@AfterMethod
	/*
	 * Method to close the driver instance created locally
	 */
	public void tearDown() {
		Thread_local_driversetup.getDriver().quit();
	}

	@DataProvider(name = "Amazonadd_cart")
	/*
	 * Data provider for add cart method
	 */
	public static Object[][] retrieve1() throws IOException {

		return (GetDataFromExcel.data("Sheet1"));
	}

	@DataProvider(name = "egift_selection")
	/*
	 * Data provider for egift cart method
	 */
	public static Object[][] retrieve12() throws IOException {

		return (GetDataFromExcel.data("Sheet2"));
	}

}
