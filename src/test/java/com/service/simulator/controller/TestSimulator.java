package com.service.simulator.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSimulator {

        SimulatorDelegate simulatorDelegate = new SimulatorDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = simulatorDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}