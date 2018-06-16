import factoryBrowser.FactoryBrowser;
/*
import pages.Dashboard;
import pages.LeftMenuBar;
import pages.Login;
import pages.EditarPerfil;
*/
import pages.*;

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
    public static EditarPerfil editarPerfilPage;
    public static RegistrarUsuario registrarUsuarioPage;

    @BeforeClass
    public static void openBrowser(){
        loginPage = new Login();
        dashboardPage = new Dashboard();
        leftMenuBarPage = new LeftMenuBar();
        editarPerfilPage = new EditarPerfil();
        registrarUsuarioPage = new RegistrarUsuario();
    }

    @Test
    public void valid_UserCredential() throws InterruptedException {
        Browser.getCurrentSesion().driver.get("http://localhost:4200/welcome/");

        /**
         * login unit test
         * dashboardPage.loginLink.click();
         * loginPage.userTextBox.click();
         * loginPage.userTextBox.set("nombre");
         * loginPage.passwordTextBox.click();
         * loginPage.passwordTextBox.set("asdASD123@@");
         * loginPage.logginButton.click();
         * Thread.sleep(500);
         */
        
        

        /**
         * editar perfil unit test
         * dashboardPage.editarPerfilLink.click();
         * editarPerfilPage.idTextBox.set("8");
         * editarPerfilPage.userPictureTextBox.set("https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png");
         * editarPerfilPage.mailTextBox.set("newMail");
         * editarPerfilPage.passwordTextBox.set("myN3wP4ss@");
         * editarPerfilPage.userTextBox.set("usernew");
         * editarPerfilPage.nTarjetaTextBox.set("0");
         * editarPerfilPage.acceptButton.click();
         * Thread.sleep(500);
         */
        
        /**
         * registrar usuario
         */
        
        dashboardPage.registrarUsuarioLink.click();
        registrarUsuarioPage.mailTextBox.set("anotherMail");
        registrarUsuarioPage.passwordTextBox.set("asdASD123@@");
        registrarUsuarioPage.userTextBox.set("anotherUser");
        registrarUsuarioPage.acceptButton.click();
        Thread.sleep(500);
        
        

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
        */
        


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