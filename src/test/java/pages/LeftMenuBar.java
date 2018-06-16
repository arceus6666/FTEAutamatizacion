package pages;

import control.Button;
import control.Link;
import control.TextBox;
import org.openqa.selenium.By;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class LeftMenuBar {

    public Button createProjectButton;
    public TextBox nameProjectTextBox;
    public Button addProjectButton;
    public Link logoutLink;

    public LeftMenuBar() {
        createProjectButton = new Button(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div"));
        nameProjectTextBox = new TextBox(By.xpath("//*[@id=\"NewProjNameInput\"]"));
        addProjectButton = new Button(By.xpath("//*[@id=\"NewProjNameButton\"]"));
        logoutLink = new Link(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));

    }
}
