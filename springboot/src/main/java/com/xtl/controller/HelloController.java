package com.xtl.controller;

import com.xtl.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 31925
 * @className HelloController
 * @description TODO
 * @date 2022/5/11 14:35
 */
@RestController
public class HelloController {

    @GetMapping("/getUser")
    public User getUser() {
        return new User(1,"李星云",25);
    }
}
