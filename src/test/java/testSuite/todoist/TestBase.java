package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetProperties;

public class TestBase {

    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();

    MenuHomeSection menuHomeSection = new MenuHomeSection();

    CentralSection centralSection = new CentralSection();

    MenuProjectSection menuProjectSection = new MenuProjectSection();
    ModalProject modalProject = new ModalProject();
    TasksSection tasksSection = new TasksSection();

    ModalDelete modalDelete = new ModalDelete();

    String user= GetProperties.getInstance().getUser();
    String password =GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
       // Session.getInstance().closeSession();
    }

}
