package com.derrick.jekins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author derrick.yang
 * @Date 11/3/18 3:22 AM
 */

@RestController
public class TestController {
    @GetMapping(value = "/testJenkins")
    public String testJenkins() {
        return "jenkins deployed!";
    }
}
