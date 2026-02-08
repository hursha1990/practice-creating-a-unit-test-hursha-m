package org.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

public class MainTest {

    @Test
    public void testAdd(){
        int a = 2;
        int b = 3;
        Main obj = new Main();
        int result = obj.add(a, b);

        Assert.assertEquals(5, result);
    }
}
