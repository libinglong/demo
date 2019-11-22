package com.huli.saas.multirenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libinglong HLJF0921
 * <a href="mailto:libinglong@huli.com">libinglong:libinglong@huli.com</a>
 * @since 2019/11/19
 */
@RestController
@RequestMapping("health")
public class HealthCheck {

    @GetMapping("check")
    public String check(){
        return "ok";
    }

}
