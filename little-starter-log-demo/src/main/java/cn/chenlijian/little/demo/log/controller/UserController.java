package cn.chenlijian.little.demo.log.controller;

import cn.chenlijian.little.common.annotation.log.ApiLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @ApiLog(value = "hello")
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return "hello " + name;
    }
}
