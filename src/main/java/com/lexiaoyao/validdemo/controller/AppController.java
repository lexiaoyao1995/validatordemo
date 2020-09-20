package com.lexiaoyao.validdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 采用正则，在pathvarable中做参数校验
 * 如果不匹配正则，则返回404
 */
@RestController
@RequestMapping("pathVariable")
public class AppController {

    @GetMapping("/id/{id:\\d+}")
    public String getId(@PathVariable("id") Integer id) {
        return String.valueOf(id);
    }

    @GetMapping("char/{char:[a-zA-Z0-9_]+}")
    public String getChar(@PathVariable("char") String charVar) {
        return charVar;
    }

}