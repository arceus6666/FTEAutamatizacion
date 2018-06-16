package factoryBrowser;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Arceus6666 on 11/06/2018.
 */
public class IE implements IBrowser{
    @Override
    public WebDriver create() {
        String PATH_PROJECT=new File(".").getAbsolutePath().replace(".","");

        System.setProperty("webdriver.ie.driver", PATH_PROJECT+"src\\test\\java\\drivers\\IEDriverServer.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);

        //ChromeOptions options = new ChromeOptions();
        //InternetExplorerDriver options = new InternetExplorerDriver();

        //options.addArguments("--enable-memory-info");
        //options.addArguments("--no-sandbox");
        //options.setExperimentalOption("prefs", prefs);

        //WebDriver driver = new FirefoxDriver(options);
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
