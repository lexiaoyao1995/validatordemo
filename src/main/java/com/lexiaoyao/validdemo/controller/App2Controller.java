package com.lexiaoyao.validdemo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * 单个参数的校验
 * 在@Validated
 */
@RestController
@RequestMapping("valid1")
@Validated
public class App2Controller {

    @GetMapping
    public String get(@NotEmpty(message = "name不能为空") String name, @Min(value = 12) Integer age) {
        return name + ":" + age;
    }

}