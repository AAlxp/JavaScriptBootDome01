package com.example.javascriptbootdome01.jdbc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author 李晓鹏
 * @date 2023/10/8 11:03
 * @description:
 */
@Entity(name = "t_authority")//设置ORM实体类，并指定映射的表名
public class Authority implements Serializable {
    @Id //表明映射对应的主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //设置主键自增策略
    private Integer id;
    private String authority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", authority='" + authority + '\'' +
                '}';
    }
}