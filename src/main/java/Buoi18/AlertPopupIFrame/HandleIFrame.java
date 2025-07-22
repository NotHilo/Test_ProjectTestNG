package Buoi18.AlertPopupIFrame;

import Initialization.Init;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleIFrame extends Init {

    @Test
    public void demo() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/iframe-demo/");
        int sizeIFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println("number of IFrame: " + sizeIFrame);
        System.out.println("Switching to frame 1...");
        Thread.sleep(2);

        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//div[@id='__next']//div[@class='rsw-ce']")).getText());
        Thread.sleep(2);

//        driver.switchTo().frame("iFrame1");
//        System.out.println(driver.findElement(By.xpath("//div[@id='__next']//div[@class='rsw-ce']")).getText());
//        Thread.sleep(3);
    }
}
