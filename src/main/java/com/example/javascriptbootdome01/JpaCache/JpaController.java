package com.example.javascriptbootdome01.JpaCache;

import com.example.javascriptbootdome01.SQL.jpa.Discuss;
import com.example.javascriptbootdome01.SQL.jpa.DiscussRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

/**
 * @author 李晓鹏
 * @date 2023/9/22 11:06
 * 博客： https://zhanjq.blog.csdn.net/?type=blog
 * @description:
 */
@RestController
public class JpaController {

    @Autowired
    private DiscussRepository discussRepository1;

    @GetMapping("/get/{id}")
     @Cacheable(cacheNames = "comment")
    public Discuss findById(@PathVariable("id") int comment_id) {
        Optional<Discuss> optional = discussRepository1.findById(1);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
}
