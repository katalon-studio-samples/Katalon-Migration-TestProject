package io.testproject.generated.tests.katalontestprojectAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class was automatically generated by TestProject Project: Katalon Test
 * Project Test: WEB- Katalon Docs Generated by: Mohit Kumar
 * (mohit.kumar@katalon.com) Generated on Fri Dec 09 12:22:08 GMT 2022.
 */
public class TestCase2_KatalonDocs implements Test {
	public static WebDriver driver;

	/**
	 * ApplicationURL test parameter
	 */
	public String ApplicationURL = "https://docs.katalon.com/";

	public void execute(WebDriver parentDriver) throws Exception {
		driver = parentDriver;
		// set timeout for driver actions (similar to step timeout)
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		By by;
		boolean booleanResult;

		// 1. Navigate to '{{ApplicationURL}}'
		// Navigates the specified URL (Auto-generated)
		GeneratedUtils.sleep(500);
		driver.navigate().to(ApplicationURL);

		// 2. Click 'Search'
		GeneratedUtils.sleep(500);
		by = By.xpath("//span/span[. = 'Search']");
		driver.findElement(by).click();

		// 3. Click 'Search docs'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#docsearch-input");
		driver.findElement(by).click();

		// 4. Type 'Self healing' in 'Search docs'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#docsearch-input");
		driver.findElement(by).sendKeys("Self healing");

		// 5. Click 'svg'
		GeneratedUtils.sleep(500);
		by = By.xpath("//section[1]/ul/li[1]/a/div/div[1]/*");
		driver.findElement(by).click();
		GeneratedUtils.sleep(5000);

	}
}
