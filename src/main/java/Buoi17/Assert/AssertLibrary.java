package Buoi17.Assert;

import Initialization.Init;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertLibrary extends Init {

    @Test
    public void RunTest() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(originalTitle, expectedTitle);

        //Soft-Assert: xác minh nhưng không dừng lại khi sai.
    }
}
