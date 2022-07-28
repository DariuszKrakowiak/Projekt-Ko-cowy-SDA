package app;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSeleniumBDD {

    @Given("Plan testow")
    public void plan_testow() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/document/d/1HTPUMBmLPlCI_Q2PtPDaxFuuDpueedPu0lFQw2bfQfw/edit#");
        driver.close();
    }
    @When("Otwieram przypadki testowe")
    public void otwieram_przypadki_testowe() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/spreadsheets/d/1JCnhMpP4ZpPEIibLsG5nkjDouWlGoJ0N/edit#gid=659914066");
        driver.close();
    }
    @Then("Otwieram raport z testow")
    public void otwieram_raport_z_testow() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/document/d/14ngo08hVttvf7DBsEkVI9_3kIj7EMmxN/edit#");
        driver.close();
    }
}
