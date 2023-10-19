package com.example.javascriptbootdome01.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
public interface AuthorityRepository extends JpaRepository<Authority,Integer> {
    @Query(value = "select a.* from t_customer c,t_authority a,t_customer_authority ca where ca.customer_id=c.id and ca.authority_id=a.id and c.username=?1", nativeQuery = true)
    List<Authority> findAuthoritiesByUsername(String username);

}
