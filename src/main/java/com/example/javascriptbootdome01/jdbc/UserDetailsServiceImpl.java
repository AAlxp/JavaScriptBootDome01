package com.example.javascriptbootdome01.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    CustomerService customerServices;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //通过业务方法获取用户及权限信息
        Customer customer = customerServices.getCustomer(username);
        List<Authority> authorities = customerServices.getCustomerAuthority(username);
        //对用户权限封装
        List<SimpleGrantedAuthority> list = authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .collect(Collectors.toList());

        if (customer != null) {
            UserDetails userDetails = new User(customer.getUsername(), customer.getPassword(), list);
            return userDetails;
        } else {
            throw new UsernameNotFoundException("用户不存在");
        }
    }
}