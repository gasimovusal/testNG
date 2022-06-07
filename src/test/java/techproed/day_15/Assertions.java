package techproed.day_15;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    @Test
    public void hardAssert(){
//        when an assertion fails, then test case stops execution and rest of the test case will not execute
        System.out.println("Line 11"); // runs
        System.out.println("line 12"); // runs
        Assert.assertEquals(3, 4); // runs. fails and stops
        System.out.println("Line 15"); // no run
        Assert.assertEquals("apple", "samsung"); // runs
        System.out.println("Line 16"); // no run
    }
    @Test
    public void testCase(){
        System.out.println("Line23"); // runs
    }
//    by default all methods are independent. we can make the dependent using dependsOnMethod
//    best practice is to make the tests independent
    @Test(dependsOnMethods = "hardAssert")
    public void dependentMethodDemo(){
        System.out.println("Line24"); // runs
    }
    @Test
    public void softAssertion(){
//        Soft assertion : Verification. Tests continue to execute even after failure
//        1. Create soft assert object
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Line 46");
//        2. use soft assert to logs test as pass or fail
        softAssert.assertEquals(2,3);
        System.out.println("Line 47");
        softAssert.assertEquals(2,2);
        System.out.println("Line 51");
        softAssert.assertEquals(2,4);
        System.out.println("Line 53");

//        3. use assertAll() to make the result, this should be used at the end
        softAssert.assertAll();
    }
}
