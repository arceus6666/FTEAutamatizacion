package browserManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by Arceus6666 on 12/06/2018.
 */

/**
 *
 */
public class Browser {
    private static Browser ourInstance = null;
    public static WebDriver driver;

    /**
     *
     * @return
     */
    public static Browser getCurrentSesion() {
        if(ourInstance==null)
            ourInstance = new Browser();

        return ourInstance;
    }

    /**
     *
     */
    private Browser() {
        driver = FactoryBrowser.make(FactoryBrowser.CHROME).create();
        //driver = FactoryBrowser.make(FactoryBrowser.FIREFOX).create();
        //driver = FactoryBrowser.make(FactoryBrowser.IE).create();
    }

    public static void closeBrowser() {
        //driver.quit();
        driver.close();
        ourInstance = null;
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
