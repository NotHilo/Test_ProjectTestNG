package Buoi18.AlertPopupIFrame;

import Initialization.Init;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlePopup2 extends Init {

    @Test
    public void HandlePopup2() throws InterruptedException {

        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);

        String mainWindow = driver.getWindowHandle();
        driver.switchTo().window(mainWindow);
        Thread.sleep(2000);

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(driver.getWindowHandle())) {
                driver.switchTo().window(window);
                System.out.println(window);
                Thread.sleep(2000);
            }
        }
    }
}