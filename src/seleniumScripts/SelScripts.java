package seleniumScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SelScripts {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("chrome");
		ss.scrollwebPage();
	}
	public void scrollwebPage() {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	  	JavascriptExecutor js= ((JavascriptExecutor)driver);
	  	js.executeScript("window.scrollBy(0,800);");
	}

	public void captureScreenShot() throws IOException {
		driver.get("https://jqueryui.com/droppable/");
		// switching into frame
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		File file = drop.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\Beforedrop.jpeg"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		// capture screenshot
		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\dd.png"));

		file = drop.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\Afterdrop.jpeg"));

	}

	public void handleDropDown() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com/");
		WebElement createAccbtn = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		createAccbtn.click();

		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		String defaultoption = select.getFirstSelectedOption().getText();
		System.out.println(defaultoption);

		System.out.println("======");
		List<WebElement> alloption = select.getOptions();
		System.out.println("Number of option: " + alloption.size());
		alloption.forEach(x -> {
			System.out.println(x.getText());
		});
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("8");
		Thread.sleep(1000);
		select.selectByVisibleText("Dec");
		System.out.println(select.isMultiple());

	}

	public void handlemouseClick() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
		// perform leftclick
		WebElement leftclickele = driver.findElement(By.id("my-dropdown-1"));
		leftclickele.click();

		// rightclick contextclick
		WebElement rightclickele = driver.findElement(By.id("my-dropdown-2"));
		Actions action = new Actions(driver);
		action.contextClick(rightclickele).perform();

		// doubleclick
		WebElement doubleclickele = driver.findElement(By.id("my-dropdown-3"));
		action.doubleClick(doubleclickele).perform();

		// select option from context menu
		WebElement contextmenu = driver.findElement(By.id("context-menu-3"));
		action.moveToElement(contextmenu).sendKeys(Keys.ARROW_DOWN).click().build().perform();

	}

	public void dragandDrop() {
		driver.get("https://jqueryui.com/droppable/");
		// switching into frame
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).perform();

		// handling slider
		// action.clickAndHolddrop).moveByOffset(0, 0).build().perform();
	}

	public void handleFrame() {
		driver.get("https://jqueryui.com/droppable/");
		// switching into frame
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.isDisplayed());

		driver.switchTo().defaultContent();
		WebElement img = driver.findElement(By.xpath("//a[@href='/']"));
		System.out.println(img.isDisplayed());

	}

	public void handleModalWindow() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		driver.findElement(By.id("my-modal")).click();
		WebElement label = driver.findElement(By.id("exampleModalLabel"));
		System.out.println(label.getText());
		WebElement saveBtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		Thread.sleep(1000);
		saveBtn.click();
	}

	public void handleAlert() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		// No alertException
		// Alert alert= driver.switchTo().alert();
		WebElement palertbtn = driver.findElement(By.id("my-prompt"));
		palertbtn.click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.sendKeys("TestUser");
		Thread.sleep(1000);
		alert.accept();
		String msg = driver.findElement(By.id("prompt-text")).getText();
		System.out.println("User msg: " + msg);

	}

	public void handleCheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement checkbox = driver.findElement(By.id("my-check-2"));
		System.out.println(checkbox.isSelected());
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		System.out.println(checkbox.isSelected());
	}

	public void handleHyperlink() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		System.out.println(driver.getCurrentUrl());
		WebElement link = driver.findElement(By.linkText("Return to index"));
		link.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		link = driver.findElement(By.partialLinkText("to index"));
		link.click();
		System.out.println(driver.getCurrentUrl());
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
