package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TasksSection {

    public Button addTaskButton = new Button(By.xpath("//button[text()='Add task']"));
    public TextBox titleTaskTextBox = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']//span"));
    public TextBox descriptionTaskTextBox = new TextBox(By.xpath("//textarea[@placeholder='Description']"));
    public Button saveTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));

    public Button moreTaskActionsButton = new Button(By.xpath("//button[@aria-label='More task actions']"));
    public Label editTaskLabel = new Label(By.xpath("//div[text()='Edit task']"));
}
//button[text()='Add task']

//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']//span

//textarea[@placeholder='Description']

//button[@data-testid='task-editor-submit-button']
