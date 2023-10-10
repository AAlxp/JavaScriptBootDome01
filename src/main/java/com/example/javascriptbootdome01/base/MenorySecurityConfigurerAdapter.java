//package com.example.javascriptbootdome01.base;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
///**
// * @author 李晓鹏
// * @date 2023/10/8 14:10
// * @description:
// */
//@EnableWebSecurity//开启MVC Security安全支持
//public class MenorySecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //密码需要设置编码器
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        //使用用户内存信息，作为测试使用
//        auth.inMemoryAuthentication().passwordEncoder(encoder)
//                .withUser("lxp").password(encoder.encode("12345")).roles("common")
//                .and()
//                .withUser("李晓鹏").password(encoder.encode("12345")).roles("vip");
//    }
//}
