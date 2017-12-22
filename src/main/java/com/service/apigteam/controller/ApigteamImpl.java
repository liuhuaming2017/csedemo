package com.service.apigteam.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-22T02:06:13.746Z")

@RestSchema(schemaId = "apigteam")
@RequestMapping(path = "/apigteam", produces = MediaType.APPLICATION_JSON)
public class ApigteamImpl {

    @Autowired
    private ApigteamDelegate userApigteamDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userApigteamDelegate.helloworld(name);
    }

}
