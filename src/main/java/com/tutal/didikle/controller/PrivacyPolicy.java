package com.tutal.didikle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivacyPolicy {

    @GetMapping({"/privacy-policy"})
    public String hello() {

        return "privacy-policy";
    }

}
