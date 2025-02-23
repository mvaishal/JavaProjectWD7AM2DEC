package seleniumScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelScripts {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("chrome");
		ss.explicitwait();
		// ss.closeBrowser();

	}

	public void explicitwait() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//p[contains(text(), 'Done')]"))));
		WebElement doneText = driver.findElement(By.xpath("//p[contains(text(), 'Done')]"));

		if (doneText.isDisplayed()) {
			System.out.println("Page Loaded" + doneText.getText());
		} else {
			System.out.println("Page Not laoded");
		}
	}

	public void closeBrowser() {

		driver.close();
	}

	public void handlingCalender() {
		// March 30 2024
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement calInput = driver.findElement(By.xpath("//input[@name='my-date']"));
		calInput.click();
		String calTitle = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/thead/tr[2]/th[2]"))
				.getText();

		System.out.println(calTitle);
		String month = calTitle.split(" ")[0].trim();
		String year = calTitle.split(" ")[1].trim();
		// "2023"+1;
		String nyear = String.valueOf(Integer.parseInt(year) + 1);

		while (!(month.equals("March") && (year.equals(nyear)))) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='�']"))
					.click();
			calTitle = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/thead/tr[2]/th[2]"))
					.getText();
			month = calTitle.split(" ")[0].trim();
			year = calTitle.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//td[normalize-space()='30']")).click();

	}

	public void handlenewtabs() {
		driver.get("https://www.naukri.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://resume.naukri.com/?fftid=100001");
	}

	public void handleMultiplewindows() {
		driver.get("https://www.naukri.com/");
		String mainwindowPage = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		WebElement services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		services.click();
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			if (!id.equals(mainwindowPage)) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		driver.switchTo().window(mainwindowPage);
		System.out.println(driver.getCurrentUrl());
	}

	public void agreetemscheckbox() {
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		driver.findElement(By.xpath("//label[@for='input-agree']")).click();
	}

	public void getalllinksofWebPage() {
		driver.get("https://jqueryui.com/tooltip/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());

		// links -options under widget section

		List<WebElement> widgetLink = driver.findElements(By.xpath("//div[@id='sidebar']/aside[2]/ul/li"));

		System.out.println("Links under widget:\n" + widgetLink.size());

		widgetLink.forEach(x -> {
			String text = x.getText();
			System.out.println(text);
		});

	}

	public void fileUpload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement inputfile = driver.findElement(By.name("my-file"));
		inputfile.sendKeys("D:\\sampletestcase\\Gurur99Bank_TestCase.xlsx");
	}

	public void handletooltip() {
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));

		String tooltip = age.getAttribute("title");
		System.out.println("Tooltip:\n" + tooltip);
	}

	public void scrollwebPage() {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		WebElement btn = driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// random scroll on a page
		// js;.executeScript("window.scrollBy(0,800);");
		// scroll to bring element into view
		// js.executeAsyncScript("arguments[0].scrollIntoView();", btn);

		// scroll till the pageheight
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
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
		// capture screenshot of complete page
		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\dd.png"));

		// capture screenshot of any webelement
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
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
