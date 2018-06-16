import factoryBrowser.FactoryBrowser;
import pages.Dashboard;
import pages.LeftMenuBar;
import pages.Login;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import browserManager.Browser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Example {
    //private static WebDriver driver;
    //WebElement element;

    public static Login loginPage;
    public static Dashboard dashboardPage;
    public static LeftMenuBar leftMenuBarPage;

    @BeforeClass
    public static void openBrowser(){
        loginPage = new Login();
        dashboardPage = new Dashboard();
        leftMenuBarPage = new LeftMenuBar();
    }

    @Test
    public void valid_UserCredential() throws InterruptedException {
        Browser.getCurrentSesion().driver.get("http://todo.ly/");
        //Browser.getCurrentSesion().driver.get("https://www.google.com/");

        dashboardPage.loginLink.click();
        //Thread.sleep(500);
        /*
        loginPage.userTextBox.set("arceus6666@hotmail.com");
        loginPage.passwordTextBox.set("arceusTODO41145_fail");
        loginPage.logginButton.click();

        if(leftMenuBarPage.logoutLink.isDisplayed()){
            leftMenuBarPage.createProjectButton.click();
            leftMenuBarPage.nameProjectTextBox.set("pruebaAutomatizada2-2");
            leftMenuBarPage.addProjectButton.click();
        }

        // verificaciones
        Assert.assertTrue("No se pudo ingresar al sistema",leftMenuBarPage.logoutLink.isDisplayed());
        Assert.assertEquals("Error","Logout",leftMenuBarPage.logoutLink.getTextValue());


        
        
        /*
        //browser.get("https://outlook.live.com/owa/");
        //browser.get("https://www.google.com/");
        
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='lst-ib']")).clear();
        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Todo.ly");
        driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
        */

        /*
        //browser.findElement(By.xpath("//*[@id='lst-ib']")).clear();
        //browser.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("hotmail.com");
        //browser.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        //browser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
        //browser.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
        browser.findElement(By.xpath("/html/body/section/div/div[2]/a[2]")).click();
        browser.findElement(By.xpath("//*[@id=\"i0116\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("arceus6666@hotmail.com");
        browser.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"i0118\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("arceusHotmail41145");
        browser.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"_ariaId_26\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input")).click();
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input")).sendKeys("valealiaga21@gmail.com");
        Thread.sleep(500);
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]")).click();
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input")).click();
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input")).sendKeys("Prueba alv :v");
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div")).click();
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div")).sendKeys("Prueva alv :y");
        browser.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[5]/div/div[2]/div[1]/button[1]")).click();
        */

        //browser.findElement(By.xpath("")).click();
        //browser.findElement(By.xpath("")).click();

        Thread.sleep(1000);

        /*
        driver.get("http://todo.ly/");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_PanelNotAuth']/div[2]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_TextBoxEmail']")).sendKeys("arceus6666@hotmail.com");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_TextBoxPassword']")).sendKeys("arceusTODO41145");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_ButtonLogin']")).click();
        */

        //driver.findElement(By.xpath("//*[@id='MainTable']/tbody/tr/td[1]/div[6]/div")).click();
        //driver.findElement(By.xpath("//*[@id='NewProjNameInput']")).click();
        //driver.findElement(By.xpath("//*[@id='NewProjNameInput']")).sendKeys("automatic2");
        //driver.findElement(By.xpath("//*[@id='NewProjNameButton']")).click();

        //driver.findElement(By.xpath("//*[@id=\"ItemId_3723188\"]/table/tbody/tr/td[3]")).click();
        //driver.findElement(By.xpath("")).
        //driver.findElement(By.xpath("")).
        //driver.findElement(By.xpath("")).

        //Thread.sleep(2000);

        /*
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        driver.findElement(By.id("log")).sendKeys("usr3");
        driver.findElement(By.id("login")).click();

        element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));

        Assert.assertNotNull(element);
        */
    }


    @AfterClass
    public static void closeBrowser() throws IOException {
        //driver.quit();

        Browser.getCurrentSesion().closeBrowser();
    }
}