package com.chestiiautomate.mathoperations.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathOpsController {

    @RequestMapping(value = "/greet", method = RequestMethod.POST)
    @ApiOperation(value = "Greet the user", notes = "Greet the user with a nice message :) ")
    public String greet(@RequestParam String param) {
        return "Hello " + param + "!";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "Add two numbers")
    public Integer add(@RequestParam Integer number1, @RequestParam Integer number2) {
        return number1 + number2;
    }
}
