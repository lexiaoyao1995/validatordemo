package com.lexiaoyao.validdemo.mode;

import com.lexiaoyao.validdemo.anno.AppValidAnno;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Data
public class User {

    @NotEmpty(message = "实体类name不能为空")
    private String name;

    @Max(value = 100)
    private Integer age;

    @AppValidAnno(message = "必须以app-开头")
    private String code;

}