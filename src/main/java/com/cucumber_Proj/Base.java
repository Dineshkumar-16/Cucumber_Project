package com.cucumber_Proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;// null driver

	// Browser Launch
	public static WebDriver browserlaunch(String name) {
		if (name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (name.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user+dir") + "\\Driver\\geckodriver.exe");
//			driver = new GeckoDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	// Url
	public static void geturl(String url) {
		driver.navigate().to(url);
	}

	// sendKeys
	public static void sendkeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	// Click
	public static void click(WebElement sigin) {
		sigin.click();
	}

	public static void scroll(String scrl) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scrl);
	}

	public static void close_mthd(WebElement qw) {
		qw.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigate_to(String mn) {
		driver.navigate().to(mn);
	}

	public static void navigate_back() {
		driver.navigate().back();
	}

	public static void navigate_forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void get_title() {
		System.out.println("The Title is : " + driver.getTitle());
	}

	public static void get_currenturl() {
		System.out.println("Current URL is : " + driver.getCurrentUrl());
	}

	public static void screenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;// narrowing
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\HP\\eclipse-workspace\\cucumber_Proj\\Screenshot\\Pic.png");
//		FileUtils.copyFile(start, end);
		FileHandler.copy(start, end);
	}

	public static void is_selected(WebElement d) {
		System.out.println("Selected or Not : " + d.isSelected());
	}

	public static void is_displayed(WebElement s) {
		System.out.println("Displayed or Not : " + s.isDisplayed());
	}

	public static void is_enabled(WebElement f) {
		System.out.println("Enabled or Not : " + f.isEnabled());
	}

	public static void is_multiple(WebElement g) {
		Select s = new Select(g);
		System.out.println("Multiple or Not : " + s.isMultiple());
	}

	public static void select(WebElement g, String type, String keys) {
		Select s = new Select(g);

		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(keys);

		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(keys);

		} else if (type.equalsIgnoreCase("index")) {
			int y = Integer.parseInt(keys);
			s.selectByIndex(y);
		}
	}

	public static void get_firstselected(WebElement j, String o) {
		Select n = new Select(j);
		if (o.equalsIgnoreCase("firstselected")) {
			System.out.println("First selected is : " + n.getFirstSelectedOption());
		}
	}

	public static void get_allselected(WebElement k) {
		Select y = new Select(k);
		List<WebElement> all = y.getAllSelectedOptions();
		System.out.println("All selected options : ");
		for (WebElement element : all) {
			System.out.println(element.getText());
		}
	}

	public static void get_options(WebElement h) {
		Select b = new Select(h);
		System.out.println("All available options are : ");
		List<WebElement> list = b.getOptions();
		for (WebElement web : list) {
			System.out.println(web);
		}
	}

	public static void gettext(WebElement t) {
		System.out.println("The text is : " + t.getText());
	}

	public static void frame_switch(WebElement k) {
		driver.switchTo().frame(k);
	}

	public static void defaultframe(WebElement v) {
		driver.switchTo().defaultContent();
	}

	public static void alert(WebElement p, String a) {
		p.click();
		Alert al = driver.switchTo().alert();
		if (a.equalsIgnoreCase("accept")) {
			al.accept();
		} else if (a.equalsIgnoreCase("dismiss")) {
			al.dismiss();
		}
	}

	public static void alert_sendkeys(WebElement f, String keys, String z) {
		f.click();
		Alert x = driver.switchTo().alert();
		x.sendKeys(keys);
		if (z.equalsIgnoreCase("accept")) {
			x.accept();
		} else if (z.equalsIgnoreCase("dismiss")) {
			x.dismiss();
		}
	}

	public static void actions(WebElement b) {
		Actions action = new Actions(driver);
		action.moveToElement(b).build().perform();
		action.click().build().perform();

	}

	public static void screenshoot(String location) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;// narrowing
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File(location);
		FileHandler.copy(start, end);
	}

	public static void wait(int sec) throws Exception {
		Thread.sleep(sec);
	}

	public static void explicit_wait(WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void implicit_wait(int sec, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(sec, format);
	}

	public static void fluent_wait(int waitsec, int pollingsec, TimeUnit format) {
//		Wait wait = new FluentWait(driver).withTimeout(waitsec, format).pollingEvery(pollingsec, format)
//				.ignoring(Exception.class);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		// scrollby is not recommended (due to pixel varies to different system)
//		         it uses pixel to scroll by.
	}

	public static String readparticular_data(String path, int row_index, int cell_index) throws Throwable {

		String value = "0";

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(row_index);
		Cell c = r.getCell(cell_index);
		CellType celltype = c.getCellType();

		if (celltype.equals(CellType.STRING)) {
			value = c.getStringCellValue();
			System.out.println(value);
		}

		else if (celltype.equals(CellType.NUMERIC)) {
			double cellValue = c.getNumericCellValue();
			int convert = (int) cellValue;
			System.out.println(convert);

		}
		return value;
	}

	public static void readall_data(String path) throws Exception {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(0);

		int rows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row r1 = s.getRow(i);

			int cells = r1.getPhysicalNumberOfCells();
			System.out.println();
			for (int j = 0; j < cells; j++) {
				Cell c1 = r1.getCell(j);
				CellType type1 = c1.getCellType();
				if (type1.equals(CellType.STRING)) {
					String value = c1.getStringCellValue();
					System.out.println(value);
				}

				else if (type1.equals(CellType.NUMERIC)) {
					double cellvalue = c1.getNumericCellValue();
					int converted = (int) cellvalue;// narrowing
					System.out.println(converted);

				}
			}
		}
	}

}
