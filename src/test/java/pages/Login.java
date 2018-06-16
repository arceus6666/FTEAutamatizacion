package pages;

import control.Button;
import control.TextBox;
import control.CheckBox;
import org.openqa.selenium.By;;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class Login {

    public Button logginButton;
    public TextBox userTextBox;
    public TextBox passwordTextBox;
    public CheckBox rememberCheckBox;

    public Login() {
        logginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
        userTextBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]"));
        passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
        rememberCheckBox = new CheckBox(By.id("ctl00_MainContent_LoginControl1_CbRemember"));
    }
}
