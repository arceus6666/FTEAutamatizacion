package pages;

import control.Button;
import control.Link;
import org.openqa.selenium.By;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class Dashboard {

    public Link loginLink;
    public Button editarPerfilButton;
    public Link registrarUsuarioLink;

    public Dashboard() {
        loginLink = new Link(By.xpath("/html/body/app-root/div/div[3]/a"));
        editarPerfilButton = new Button(By.xpath("/html/body/app-root/app-mostrar-usuario/body/div/button"));
        registrarUsuarioLink = new Link(By.xpath("/html/body/app-root/div/div[2]/a"));
    }
}
