package Buoi18.AlertPopupIFrame;

import Initialization.Init;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlePopup extends Init {

    @Test
    public void getWindow() throws InterruptedException {

        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();

        // Lưu lại lớp window đầu tiên - mã ID hơi dài, in ra sẽ thấy :)
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        // Lấy tất cả các mã định danh Tab Window.
        Set<String> allWindows = driver.getWindowHandles();

        //Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        for (String window : allWindows) {
            if (!mainWindow.equals(window)) {
                //So sánh nếu thằng nào khác thằng Chính (đầu tiên) thì chuyển hướng qua nó mới thao tác được
                //Chuyển hướng driver đến Tab mới (Tab con)
                driver.switchTo().window(window);
                Thread.sleep(1);
                System.out.println("Đã chuyển đến Tab Window mới");
                Thread.sleep(1);

                //Một số hàm hỗ trợ
                System.out.println(driver.switchTo().window(window).getTitle());
                System.out.println(driver.switchTo().window(window).getCurrentUrl());

                Thread.sleep(1);
                //Sau khi chuyển hướng sang Tab mới thì getText cái header
                System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());

                // Tắt cái Tab Window mới.
                Thread.sleep(1);;
                driver.close();
            }
        }
    }
}
