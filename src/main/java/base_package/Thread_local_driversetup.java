package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thread_local_driversetup {

	public static ThreadLocal<WebDriver> thldriver = new ThreadLocal<WebDriver>();

	/*
	 * Set Driver instance using Webdriver manager
	 */
	public void setDriver() {

		WebDriverManager.chromedriver().setup();
		thldriver.set(new ChromeDriver());
	}

	/*
	 * Get Driver instance created using SetDriver method
	 */

	public static synchronized WebDriver getDriver() {
		return thldriver.get();
		
	}

}
