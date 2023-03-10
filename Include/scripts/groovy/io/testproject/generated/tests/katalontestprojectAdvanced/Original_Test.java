package io.testproject.generated.tests.katalontestprojectAdvanced;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;


/**
 * This class was automatically generated by TestProject Project: Katalon Test
 * Project Test: Web- Test variable Generated by: Mohit Kumar
 * (mohit.kumar@katalon.com) Generated on Thu Dec 08 15:43:22 GMT 2022.
 */

@DisplayName("Web- Test variable")
public class Original_Test {
	public static WebDriver driver;

	@BeforeAll
	static void setup() throws Exception {
		System.out.println("BeforeAll");
		WebUiBuiltInKeywords.openBrowser("");
		driver = DriverFactory.getWebDriver();

	}

	/**
	 * In order to upload the test to TestProject need to
	 * un-comment @ArgumentsSource and set in comment
	 * the @MethodSource @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class)
	 */

	@DisplayName("Web- Test variable")
	@ParameterizedTest
	@MethodSource("provideParameters")
	@Test
	void execute(String ApplicationURL, String username, String password) throws Exception {
		System.out.println("ParameterizedTest");
		// set timeout for driver actions (similar to step timeout)
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		By by;
		boolean booleanResult;
		String string;

		// 1. Navigate to '{{ApplicationURL}}'
		// Navigates the specified URL (Auto-generated)
		GeneratedUtils.sleep(500);
		driver.navigate().to(ApplicationURL);

		// 2. Click 'I'
		GeneratedUtils.sleep(500);
		by = By.xpath("//body/a/i");
		driver.findElement(by).click();

		// 3. Click 'Login'
		GeneratedUtils.sleep(500);
		by = By.xpath("//a[. = 'Login']");
		driver.findElement(by).click();

		// 4. Scroll window by ('0','500')
		GeneratedUtils.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");

		// 5. Click 'username1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-username");
		driver.findElement(by).click();

		// 6. Type '{{username}}' in 'username1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-username");
		driver.findElement(by).sendKeys(username);

		// 7. Click 'password'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-password");
		driver.findElement(by).click();

		// 8. Click 'password'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-password");
		driver.findElement(by).click();

		// 9. Type '{{password}}' in 'password'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-password");
		driver.findElement(by).sendKeys(password);

		// 10. Click 'Login1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#btn-login");
		driver.findElement(by).click();

		// 11. Click 'facility'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#combo_facility");
		driver.findElement(by).click();

		// 12. Select the 'Seoul CURA Healthcare Center' option in 'facility'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#combo_facility");
		(new Select(driver.findElement(by))).selectByValue("Seoul CURA Healthcare Center");

		// 13. Click 'hospital_readmission'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#chk_hospotal_readmission");
		driver.findElement(by).click();

		// 14. Click 'programs'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#radio_program_medicaid");
		driver.findElement(by).click();

		// 15. Click 'visit_date'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_visit_date");
		driver.findElement(by).click();

		// 16. Click '27'
		GeneratedUtils.sleep(500);
		by = By.xpath("//td[3][. = '27']");
		driver.findElement(by).click();

		// 17. Click 'comment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_comment");
		driver.findElement(by).click();

		// 18. Type '{{Description}}' in 'comment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_comment");
		driver.findElement(by).sendKeys(ProjectParameters.Description);

		// 19. Click 'Book Appointment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#btn-book-appointment");
		driver.findElement(by).click();

		// 20. Get text from 'Appointment Confirmation'
		GeneratedUtils.sleep(500);
		by = By.xpath("//h2[. = 'Appointment Confirmation']");
		string = driver.findElement(by).getAttribute("value");

		// 21. Get text from 'Seoul CURA Healthcare Center'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#facility");
		string = driver.findElement(by).getAttribute("value");

		// 22. Get text from 'Test Demo'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#comment");
		string = driver.findElement(by).getAttribute("value");

	}

	@AfterClass
	static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	private static Stream provideParameters() throws Exception {
		return Stream.of(Arguments.of("https://katalon-demo-cura.herokuapp.com/", "John Doe", "ThisIsNotAPassword"));
	}
}
