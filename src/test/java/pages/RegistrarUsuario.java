package pages;
/**
 * Created by Arceus6666 on 16/06/2018.
 */

import control.Button;
import control.TextBox;
import control.CheckBox;
import org.openqa.selenium.By;

public class RegistrarUsuario {
  
  
  public TextBox mailTextBox;
  public TextBox passwordTextBox;
  public TextBox userTextBox;
  
  public Button acceptButton;
  
  public RegistrarUsuario() {
    
    mailTextBox = new TextBox(By.xpath("/html/body/app-root/app-registrarse/body/div/input[1]"));
    passwordTextBox = new TextBox(By.xpath("/html/body/app-root/app-registrarse/body/div/input[2]"));
    userTextBox = new TextBox(By.xpath("/html/body/app-root/app-registrarse/body/div/input[3]"));
    
    acceptButton = new Button(By.xpath("/html/body/app-root/app-registrarse/body/div/input[4]"));
  }

  
}
