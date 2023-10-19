package com.example.javascriptbootdome01.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
        //    可以直接使用JPA生成的实现
//    @Query(value = "select c.* from t_customer c where c.username=?1", nativeQuery = true)
        Customer findByUsername(String username);
}
