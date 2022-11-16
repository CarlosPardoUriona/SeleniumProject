package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class BasicSeleniumTest2 {

   public static void main(String[] args){
       // prints Java Runtime Version before property set
       System.out.print("Previous : ");
       System.out.println(System.getProperty("webdriver.chrome.driver"));
       System.setProperty("java.runtime.version", "Java Runtime 1.6.0");

       // prints Java Runtime Version after property set
       System.out.print("New : ");
       System.out.println(System.getProperty("java.runtime.version" ));

   }
}
