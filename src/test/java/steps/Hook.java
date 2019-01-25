package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.DriverSetUp;

public class Hook {

    @Before()
    public void setUp(){
        DriverSetUp.getInstanc().startDriver();
    }

    @After()
    public void tearDown(){
        DriverSetUp.getInstanc().stopDriver();
    }

}