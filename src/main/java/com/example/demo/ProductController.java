package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cjw
 * @Date: 2019/2/21 17:13
 * @Description:
 */
@RestController
public class ProductController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello "+name+"，this is first messge";
    }
}
