package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTest extends TestBase{

    @Test
    public void verifyCRUDProject() {
        String projectCreated = "PROJECT"+new Date().getTime();
        String projectUpdated = "UPDATED"+new Date().getTime();
        //LogIn
        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        Assertions.assertTrue(menuHomeSection.homeButton.isControlDisplayed(),"ERROR! the login faild!!!!!!!");


        //Create New Project
        menuProjectSection.addProjectButton.click();
        modalProject.nameProjectTextBox.setText(projectCreated );
        modalProject.addProjectButton.click();
        Assertions.assertTrue(centralSection.isProjectDisplayedInCentralSection(projectCreated),"ERROR! the Project was not created!!!!!!!");

        //Update Project
        menuProjectSection.moreProjectActionsButton.click();
        menuProjectSection.editProjectLabel.click();
        modalProject.nameProjectTextBox.cleanSetText(projectUpdated);
        modalProject.saveUpdateButton.click();
        Assertions.assertTrue(centralSection.isProjectDisplayedInCentralSection(projectUpdated),"ERROR! the Project was not updated!!!!!!!");

        //Delete Project
        menuProjectSection.moreProjectActionsButton.click();
        menuProjectSection.deleteProjectLabel.click();
        modalDelete.deleteButton.click();
        Assertions.assertFalse(centralSection.isProjectDisplayedInCentralSection(projectUpdated),"ERROR! the Project was not updated!!!!!!!");
    }
}
