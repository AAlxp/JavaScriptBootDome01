package com.example.javascriptbootdome01.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李晓鹏
 * @date 2023/10/13 13:43
 * @description:
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private RedisTemplate redisTemplate;


    //    用户名查询用户
    public Customer getCustomer(String username) {
        Customer customer = null;
        Object o = redisTemplate.opsForValue().get("customer_" + username);
        if (o != null) {
            customer = (Customer) o;
        } else {
            customer = customerRepository.findByUsername(username);
            if (customer != null) {
                redisTemplate.opsForValue().set("customer_" + username, customer);
            }
        }
        return customer;
    }

    //业务控制：使用唯一用户权限
    public List<Authority> getCustomerAuthority(String username) {
        List<Authority> authorities = null;
        Object o = redisTemplate.opsForValue().get("authorities_" + username);
        if (o != null) {
            authorities = (List<Authority>) o;
        } else {
            authorities = authorityRepository.findAuthoritiesByUsername(username);
            if (authorities.size() > 0) {
                redisTemplate.opsForValue().set("authorities_" + username, authorities);
            }
        }
        return authorities;
    }
}
