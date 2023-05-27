package com.cydeo.g20.hooks;

import com.cydeo.g20.utilities.DataFactory;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        DataFactory.resetData();
    }
}
