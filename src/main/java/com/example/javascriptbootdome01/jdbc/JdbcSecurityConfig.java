package com.example.javascriptbootdome01.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
/*@Order(102)
@EnableWebSecurity
public class JdbcSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //设置密码编译器
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        //Jdbc身份认证
        String userSQL ="select username,password,valid from t_customer " +
                "where username = ?";
        String authoritySQL="select c.username,a.authority from t_customer c,t_authority a,"+
                "t_customer_authority ca where ca.customer_id=c.id " +
                "and ca.authority_id=a.id and c.username =?";
        auth.jdbcAuthentication().passwordEncoder(encoder)
                .dataSource(dataSource)
                .usersByUsernameQuery(userSQL)
                .authoritiesByUsernameQuery(authoritySQL);
    }
}*/
