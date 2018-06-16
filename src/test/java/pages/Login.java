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
        userTextBox = new TextBox(By.xpath("/html/body/app-root/app-iniciar-sesion/body/div/input[1]"));
        passwordTextBox = new TextBox(By.xpath("/html/body/app-root/app-iniciar-sesion/body/div/input[2]"));
        logginButton = new Button(By.xpath("/html/body/app-root/app-iniciar-sesion/body/div/input[3]"));
    }
}
