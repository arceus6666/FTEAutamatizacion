package pages;

import control.Link;
import org.openqa.selenium.By;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class Dashboard {

    public Link loginLink;

    public Dashboard() {
        loginLink = new Link(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
    }
}
