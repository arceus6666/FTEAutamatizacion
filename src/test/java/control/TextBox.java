package control;

import org.openqa.selenium.By;

/**
 * Created by Arceus6666 on 13/06/2018.
 */
public class TextBox extends Control {
    public TextBox(By customLocator) {
        this.locator = customLocator;
    }
}
