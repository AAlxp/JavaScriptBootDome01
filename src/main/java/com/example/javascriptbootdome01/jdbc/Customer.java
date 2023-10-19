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
@Entity(name = "t_customer")
public class Customer implements Serializable {
    @Id //表明映射对应的主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //设置主键自增策略
    private Integer id;
    private String username;
    private String password;
    private byte valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getValid() {
        return valid;
    }

    public void setValid(byte valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", valid=" + valid +
                '}';
    }
}
