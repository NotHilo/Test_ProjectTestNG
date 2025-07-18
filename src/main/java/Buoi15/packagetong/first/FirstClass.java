package Buoi15.packagetong.first;

import org.testng.annotations.Test;

public class FirstClass {

    @Test(priority=1) // độ ưu tiên = [0] -> chạy đầu tiên
    public void firstMethod(){
        System.out.println("This is the first method of FirstClass");
    }

    @Test(priority=0)
    public void secondMethod(){
        System.out.println("This is the second method of FirstClass");
    }
}
