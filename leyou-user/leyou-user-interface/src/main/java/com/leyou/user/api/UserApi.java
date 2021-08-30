package com.leyou.user.api;

import com.leyou.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月05日
 */
@RequestMapping("user")
public interface UserApi {

    @GetMapping("query")
    public User queryUser(@RequestParam("username") String username,
                          @RequestParam("password") String password);

}
