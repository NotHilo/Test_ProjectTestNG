package Buoi16.testannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageAnhTester extends BaseTest {

    @Test
    public void LoginAnhTester() throws InterruptedException {
        driver.get("https://anhtester.com/");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.xpath("//input[@class='form-control'][@type='email']"));
        emailField.clear();
        emailField.sendKeys("tai.ngotri@gmail.com");
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.xpath("//input[@class='form-control'][@type='password']"));
        passwordField.clear();
        passwordField.sendKeys("Tai17031996@");
        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("login"));

        //Extra, dùng để cố bypass captcha, nhưng không đc
        Point location = submitButton.getLocation();
        int x = location.getX();
        int y = location.getY();

        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).moveByOffset(23, -69).click().perform();

    }
}
