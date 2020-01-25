package testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExample {

    @BeforeClass
    public void beforeclassmethod(){
        System.out.println("This will execute before class");
    }

    @BeforeMethod
    public void runBeforeMethod(){
        System.out.println("This will execute before each method");
    }


    @Test
    public void test1(){
        System.out.println("Test 1 run ");
        thisMethod();
    }

    @Test
    public void test2(){
        System.out.println("Test 2 run ");
        thisMethod();
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("This will execute after class only once");
    }

    public  void thisMethod(){
        System.out.println("Not annotated method executed");
    }
}
