package com.lexiaoyao.validdemo.conponet;

import com.lexiaoyao.validdemo.anno.AppValidAnno;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 不需要@Component
 * 实现了ConstraintValidator接口，spring会自动将其视为一个组件
 */
//@Component
public class AppValidator implements ConstraintValidator<AppValidAnno, String> {

    //注入其他逻辑类
    @Autowired
    private AppComponent appComponent;

    @Override
    public void initialize(AppValidAnno constraintAnnotation) {
        System.out.println("方法初始化");
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return appComponent.validStr(s);
    }
}