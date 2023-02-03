package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
	WebDriver driver;

	public static void main(String[] args) {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("chrome");
		ss.sendInputData();
	}

	public void sendInputData() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement textarea = driver.findElement(By.name("my-textarea"));
		textarea.sendKeys("Write something in text area");
	}

	public void selNavigationFunction() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());

	}

	public void selBasicFunction() {
		// load any url in the browser
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		// returns title of the page
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		// return the opened url in the tab
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// returns the tabid of the focused tab
		System.out.println(driver.getWindowHandle());
		// returns id of all the opened tab in the browser
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getPageSource());

	}

	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Unsupported Browser");
		}

		driver.manage().window().maximize();

	}
}
