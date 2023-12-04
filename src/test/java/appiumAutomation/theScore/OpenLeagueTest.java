package appiumAutomation.theScore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenLeagueTest {

    @Test
    public void leagueTest() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = initializeDriver(); // You need to implement the driver initialization

        OpenLeaguePage openLeaguePage = new OpenLeaguePage(driver);
        Thread.sleep(5000);
        openLeaguePage.clickPrimaryButton();
        Assert.assertEquals(openLeaguePage.getTitleOnboarding(), "Choose your favorite leagues");

        openLeaguePage.clickSecondLinearLayout();
        openLeaguePage.clickSecondPrimaryButton();
        Assert.assertEquals(openLeaguePage.getLocationTitle(), "Tailored Content");

        openLeaguePage.clickDisallowButton();
        openLeaguePage.clickFollowIconAtIndex(4);
        openLeaguePage.clickNBA();
        openLeaguePage.scrollIntoView("Miami Heat");
        openLeaguePage.clickFollowIconAtIndex(3);
        openLeaguePage.clickActionButton();
        Assert.assertEquals(openLeaguePage.getUpdatesPageTitle(), "Never miss a game");

        openLeaguePage.clickSwitchAtIndex(1);
        openLeaguePage.clickSwitchAtIndex(2);
        openLeaguePage.clickSwitchAtIndex(3);

        openLeaguePage.clickActionButton();
        Thread.sleep(2000);

        // Additional test steps can be added here

        driver.quit(); // Ensure to quit the driver after the test
    }

    private AndroidDriver initializeDriver() throws MalformedURLException {
    	DesiredCapabilities capabilities = new DesiredCapabilities();

        // Specify the desired capabilities
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "D:\\Eclipse\\theScore\\src\\test\\java\\appiumAutomation\\resources\\theScore.apk");
        // Add other capabilities as needed

        // Initialize the Android driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);

        return driver;
    }
}
