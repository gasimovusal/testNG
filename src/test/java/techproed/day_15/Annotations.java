package techproed.day_15;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }
    @Test(priority = 2)
    public void ztest1(){
        System.out.println("Test 1");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("Test 2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("Test 3");
    }
    @Ignore
    @Test
    public void test4(){
        System.out.println("Test 4");
    }
    @Test(priority = -2)
    public void atest5(){
        System.out.println("Test 5");
    }
    @Test
    public void test6(){
        System.out.println("Test 6");
    }
    @Test
    public void test7(){
        System.out.println("Test 7");
    }

    /*
    * By default, Test cases runs alphabetical order
    * By default, test case priority is 0
    * @Test: creates test case/method
    * @BeforeMethod: same as @Before in junit. runs before each method. Runs before each @Test annotation
    * @AfterMethod: same as @After in junit. runs after each method. Runs after each @Test annotation
    * @Ignore: to skip a test case
    * @Test(enabled = false): to disable test case completely, run button will be gone
    * @Test(priority = 1): priority is used for running test in specific order
     */
}
