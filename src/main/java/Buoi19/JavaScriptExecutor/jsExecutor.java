package Buoi19.JavaScriptExecutor;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class jsExecutor extends Init {

    @Test
    public void jsExecutorTest() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click on "Website Testing" module using JavascriptExecutor
        driver.get("https://anhtester.com/");
        WebElement button =  driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
    }
}
