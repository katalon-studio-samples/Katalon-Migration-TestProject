package io.testproject.generated.tests.katalontestprojectMobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This class was automatically generated by TestProject
 * Project: Katalon Test Project
 * Test: Mobile Test
 * Generated by: Mohit Kumar (mohit.kumar@katalon.com)
 * Generated on Mon Dec 05 07:36:25 GMT 2022.
 */
@DisplayName("Mobile Test")
public class MobileTestReal implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("sy3SYOrye3r2ILGiQeEGJ8tdZiAKiSgaF_h1WvPRBjY", getCapabilities(), "Mohit Kumar");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Mobile Test")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Reset App
    //    Clear application data and restart (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Click 'API Demos'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'API Demos']");
    driver.findElement(by).click();

    // 3. Click 'App'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'App']");
    driver.findElement(by).click();

    // 4. Click 'Activity'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Activity']");
    driver.findElement(by).click();

    // 5. Click 'Presentation'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Presentation']");
    driver.findElement(by).click();

    // 6. Click 'Show all displays'
    GeneratedUtils.sleep(500);
    by = By.id("com.touchboarder.android.api.demos:id/show_all_displays");
    driver.findElement(by).click();

    // 7. Click 'com.touchboarder.android.api.demos:id...'
    GeneratedUtils.sleep(500);
    by = By.id("com.touchboarder.android.api.demos:id/checkbox_presentation");
    driver.findElement(by).click();

    // 8. Click 'com.touchboarder.android.api.demos:id...1'
    GeneratedUtils.sleep(500);
    by = By.id("com.touchboarder.android.api.demos:id/display_list");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of());
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "YOUR_APP_PACKAGE");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "YOUR_APP_ACTIVITY");
    capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");
    return capabilities;
  }
}
