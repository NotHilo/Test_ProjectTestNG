package Buoi18.AlertPopupIFrame;

import Initialization.Init;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends Init {

    String text = "Tai Ngo";

//    //@Test(priority=0)
//    public void checkPage() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        WebElement title = driver.findElement(By.xpath("//h1[text()='Alerts']"));
//        Assert.assertEquals(title.getText(), "Alerts");
//        Thread.sleep(1);
//    }
//
//    //@Test (priority=1)
//    public void checkConfirmButton() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        Alert alert = driver.switchTo().alert();
//        driver.findElement(By.id("confirmButton")).click();
//
//        Assert.assertEquals(alert.getText(), "Do you confirm action?");
//        Thread.sleep(1);
//
//        alert.accept();
//        Thread.sleep(1);
//
//        WebElement confirmResult = driver.findElement(By.id("confirmResult"));
//        Assert.assertEquals(confirmResult.getText(), "You selected Ok");
//        Thread.sleep(1);
//    }
//
//    //@Test(priority=2)
//    public void checkCancelButton() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        Alert alert = driver.switchTo().alert();
//        driver.findElement(By.id("confirmButton")).click();
//
//        Assert.assertEquals(alert.getText(), "Do you confirm action?"); *đã test ở method checkConfirmButton
//        Thread.sleep(1);
//
//        alert.dismiss();
//        Thread.sleep(1);
//
//        WebElement confirmResult = driver.findElement(By.id("confirmResult"));
//        Assert.assertEquals(confirmResult.getText(), "You selected Cancel");
//        Thread.sleep(1);
//    }

    @Test (priority=0)
    public void checkConfirmButton2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        Thread.sleep(1);

        //Positive case
        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter your name");
        Thread.sleep(1);

        alert.sendKeys(text);
        Thread.sleep(1);
        alert.accept();
        Thread.sleep(1);

        WebElement promptResult = driver.findElement(By.id("promptResult"));
        Assert.assertEquals(promptResult.getText(), "You entered " + text);

        //Negative case
        driver.findElement(By.id("promtButton")).click();

//        Assert.assertEquals(alert.getText(), "Please enter your name"); *Tested in Positive case
        Thread.sleep(1);

        alert.sendKeys(text);
        Thread.sleep(1);
        alert.dismiss();
        Thread.sleep(1);

        System.out.println(promptResult);

//        Assert.assertFalse(promptResult.isDisplayed(), "promptResult is still displayed -> BUG");

    }
}
