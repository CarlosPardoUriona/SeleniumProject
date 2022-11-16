package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ModalProject {

    public TextBox nameProjectTextBox = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));
    public Button addProjectButton = new Button(By.xpath("//button[text()='Add']"));
    public Button saveUpdateButton = new Button(By.xpath("//button[text()='Save']"));

}
