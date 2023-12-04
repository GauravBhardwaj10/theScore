package appiumAutomation.theScore;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OpenLeaguePage {

    private AndroidDriver driver;

    // Constructor to initialize the driver
    public OpenLeaguePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Methods representing actions on the page

    public void clickPrimaryButton() {
        driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]")).click();
    }

    public String getTitleOnboarding() {
        return driver.findElement(By.id("com.fivemobile.thescore:id/title_onboarding")).getText();
    }

    public void clickSecondLinearLayout() {
        driver.findElement(By.xpath("(//android.widget.LinearLayout)[2]")).click();
    }

    public void clickSecondPrimaryButton() {
        driver.findElement(By.id("com.fivemobile.thescore:id/btn_primary")).click();
    }

    public String getLocationTitle() {
        return driver.findElement(By.id("com.fivemobile.thescore:id/location_title")).getText();
    }

    public void clickDisallowButton() {
        driver.findElement(By.id("com.fivemobile.thescore:id/btn_disallow")).click();
    }

    public void clickFollowIconAtIndex(int index) {
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/follow_icon\"])[" + index + "]")).click();
    }

    public void clickNBA() {
        driver.findElement(By.xpath("(//android.widget.TextView[@text='NBA'])")).click();
    }

    public void scrollIntoView(String elementText) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + elementText + "\"));"));
    }

    public void clickActionButton() {
        driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text")).click();
    }

    public String getUpdatesPageTitle() {
        return driver.findElement(By.id("com.fivemobile.thescore:id/title_onboarding")).getText();
    }

    public void clickSwitchAtIndex(int index) {
        driver.findElement(By.xpath("(//android.widget.Switch[@resource-id=\"com.fivemobile.thescore:id/selectedSwitch\"])[" + index + "]")).click();
    }
}
