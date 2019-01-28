package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.DriverSetUp;

public class Hook extends DriverSetUp{

    @Before()
    public void setUp(){
        startDriver();
    }

    @After()
    public void tearDown(){
        stopDriver();
    }

}