package com.may.controller;

import com.fasterxml.jackson.databind.deser.Deserializers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by May on 3/14/17.
 */
@Controller
@RequestMapping("/mvcs")
public class MVCController  extends BaseController{
    @RequestMapping("/hello")
    public String sayHello() {

        return "demomvc";
    }
}
