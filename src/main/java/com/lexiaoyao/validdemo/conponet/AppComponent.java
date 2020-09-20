package com.lexiaoyao.validdemo.conponet;

import org.springframework.stereotype.Component;


@Component
public class AppComponent {

    public Boolean validStr(String string) {
        return string.startsWith("app-");
    }

}