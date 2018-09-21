package com.ivy.consul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangyan 2018/9/21
 */
@RestController
public class HealthCheckController {

    @RequestMapping("health")
    public String home() {
        return "Hello world";
    }
}
