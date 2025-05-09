package cn.chenlijian.little.demo.log.controller;

import cn.chenlijian.little.common.annotation.log.ApiLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiLog(value = "hello")
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return "hello " + name;
    }

    @ApiLog(value = "skip")
    @GetMapping("/skip")
    public String skip(@RequestParam(value = "name", required = false) String name) {
        return "skip " + name;
    }

    @ApiLog(value = "skip1")
    @GetMapping("/skip1")
    public String skip1(@RequestParam(value = "name", required = false) String name) {
        return "skip1 " + name;
    }

    @ApiLog(value = "skip2")
    @GetMapping("/skip/2")
    public String skip2(@RequestParam(value = "name", required = false) String name) {
        return "skip2 " + name;
    }

    @ApiLog(value = "skip3")
    @GetMapping("/skip/3")
    public String skip3(@RequestParam(value = "name", required = false) String name) {
        return "skip3 " + name;
    }
}
