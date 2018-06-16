package control;

import org.openqa.selenium.By;
import browserManager.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class Control {
    public By locator;
    public WebElement myControl;

    public void findControl(){
        WebDriverWait wait = new WebDriverWait(Browser.getCurrentSesion().driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(this.locator));

        this.myControl = Browser.getCurrentSesion().driver.findElement(this.locator);

    }

    public void click() {
        findControl();
        myControl.click();

    }

    public void set(String value) {
        findControl();
        myControl.sendKeys(value);
    }

    public Control() {

    }

    public boolean isDisplayed(){

        try{
            Browser.getCurrentSesion().driver.findElement(locator).isDisplayed();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getTextValue(){
        findControl();
        return myControl.getText();
    }

    public String getTextValue(String attribute) {
        findControl();
        return myControl.getAttribute(attribute);
    }
}
