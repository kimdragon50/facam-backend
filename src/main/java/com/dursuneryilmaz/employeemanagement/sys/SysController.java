package com.dursuneryilmaz.employeemanagement.sys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class SysController {

    // healthz check
    @GetMapping("/healthz")
    public String healthz() {
        return "UP";
    }

}
