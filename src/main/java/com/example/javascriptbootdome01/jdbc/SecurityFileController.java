package com.example.javascriptbootdome01.jdbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
@Controller
public class SecurityFileController {
    private String TAG = "FilmeController";
    //影片详情页
    @GetMapping("/detail/{type}/{path}")
    public String toDetail(@PathVariable("type") String type, @PathVariable("path") String path) {
        String value = "detail/" + type + "/" + path;
        System.out.println(TAG + "===toDeil===" + value);
        return value;
    }
    @GetMapping("/userLogin")
    public String toLoginPage(){
        return "login";
    }

    @GetMapping("/loginError")
    String loginerror(){
        return "login/loginerror";
    }

    @GetMapping("/index2")
    String index2(){
        return "login/index2";
    }

}