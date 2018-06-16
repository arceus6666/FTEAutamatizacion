package pages;

import control.Link;
import org.openqa.selenium.By;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class Dashboard {

    public Link loginLink;
    public Link editarPerfilLink;
    public Link registrarUsuarioLink;

    public Dashboard() {
        loginLink = new Link(By.xpath("/html/body/app-root/div/a[3]"));
        editarPerfilLink = new Link(By.xpath("/html/body/app-root/div/a[4]"));
        registrarUsuarioLink = new Link(By.xpath("/html/body/app-root/div/a[2]"));
    }
}
