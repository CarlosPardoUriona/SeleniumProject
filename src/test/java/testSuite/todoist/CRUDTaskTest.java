package testSuite.todoist;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBase{

    @Test
    public void verifyCRUDTask() {
        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        //Create Task
        tasksSection.addTaskButton.click();
        tasksSection.titleTaskTextBox.setText("TASK" + new Date().getTime());
        tasksSection.descriptionTaskTextBox.setText("Tarea de prueba");
        tasksSection.saveTaskButton.click();
        //Update TASK
        tasksSection.moreTaskActionsButton.click();
        tasksSection.editTaskLabel.click();
        tasksSection.titleTaskTextBox.setText("UPDATED");
        tasksSection.descriptionTaskTextBox.setText("Updated......");
        tasksSection.saveTaskButton.click();
        //button[@aria-label='More task actions']
        //div[text()='Edit task']
        //span[text()='erwer']
        //textarea[text()='xdfsdf']
        //button[@data-testid='task-editor-submit-button']
    }
}
