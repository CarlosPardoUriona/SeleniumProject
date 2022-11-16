package page.todoist;

import control.Label;
import org.openqa.selenium.By;

public class CentralSection {
    //public Label nameProjectLabel = new Label(By.xpath("//h1[@data-testid='view_header__h1']//span[text()='Proy']"));

    public boolean isProjectDisplayedInCentralSection(String nameProject){
        Label projectCreated = new Label(By.xpath("//h1[@data-testid='view_header__h1']//span[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }
}
