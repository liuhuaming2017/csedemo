package com.service.apigteam.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestApigteam {

        ApigteamDelegate apigteamDelegate = new ApigteamDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = apigteamDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}