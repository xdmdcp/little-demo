package cn.chenlijian.little.demo.log.controller;

import cn.chenlijian.little.common.annotation.log.ApiLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    @ApiLog("调用 hello 方法") // ✅ 安全
    public String hello() {
        return "Hello";
    }

    @GetMapping("/login/{name}")
    @ApiLog("用户登录: #{#name}") // ✅ 正确使用参数
    public String login(@PathVariable String name) {
        return "Welcome, " + name;
    }

    @GetMapping("/error")
    @ApiLog("#{#root.hello}") // ❌ 会触发异常
    public String error() {
        return "Error test";
    }
}
