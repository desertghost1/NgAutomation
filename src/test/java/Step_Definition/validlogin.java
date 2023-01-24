package Step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;

public class validlogin {

    public WebDriver driver;

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://japandihomes.com/account/login?return_url=%2Faccount");

    }

    @When("^I enter valid username$")
    public void i_enter_valid_username() throws Throwable {
        driver.findElement(By.name("customer[email]")).sendKeys("ngokoye1@yahoo.com");
    }

    @And("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
        driver.findElement(By.name("customer[password]")).sendKeys("Jyvaskyla_1992");

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button")).click();

    }

    @And("^I confirm I am not a robot$")
    public void iConfirmIAmNotARobot() {driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
    }
}