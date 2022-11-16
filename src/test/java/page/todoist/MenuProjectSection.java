package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MenuProjectSection {

    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));
    public Button moreProjectActionsButton = new Button(By.xpath("//button[@aria-label='More project actions']"));
    public Label editProjectLabel = new Label(By.xpath("//div[text()='Edit project']"));
    public Label deleteProjectLabel = new Label(By.xpath("//div[text()='Delete project']"));


    //button[@aria-label='More project actions']
    //div[text()='Delete project']
    //button//span[text()='Delete']
}
