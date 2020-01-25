package tests;

import org.testng.annotations.*;
import utils.DriverManager;

public class TestHooker {

    @AfterClass
    public void quitTest(){

        DriverManager.tearDown();
    }


}
