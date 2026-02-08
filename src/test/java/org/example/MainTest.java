package org.example;
import org.junit.Assert;
import org.junit.Test;


public class MainTest {
     /*
        Checklist:
        The test class mirrors the name of the class being tested (with Test at the end)
        The test method name clearly describes what is being tested
        The test can run independently and doesn’t rely on other tests
        There is at least one test for the normal (“happy path”) case
        There is at least one test for an edge case or unusual input
        The test uses appropriate assertions to verify behavior
`    */

    @Test
    public void testAdd(){
        int a = 2;
        int b = 3;
        Main obj = new Main();
        int result = obj.add(a, b);

        Assert.assertEquals(5, result);
    }
    @Test
    public void testAddWithZeros() {
        Main obj = new Main();
        int result = obj.add(0, 0);
        Assert.assertEquals(0, result);
    }

}


