package com.chestiiautomate.mathoperations.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlocklyController {

    @GetMapping("/blockly")
    public String blockly() {
        return "blockly.html";
    }
}
