package com.example.javascriptbootdome01.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
        Customer findByUsername(String username);
}
