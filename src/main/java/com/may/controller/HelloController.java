package com.may.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by May on 3/9/17.
 */

@RestController
@RequestMapping("/api/hellos")
public class HelloController extends BaseController{


    @ApiOperation(value = "sayHello")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "名称", required = false, dataType = "String", defaultValue = "may")})
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(String name) {
        return "hello " + name+", study now !";

    }

    @RequestMapping(value = "/sayHello2",method = RequestMethod.POST)
    public String sayHello( String name1, String name2){
        return name1+"-"+name2;
    }
}
