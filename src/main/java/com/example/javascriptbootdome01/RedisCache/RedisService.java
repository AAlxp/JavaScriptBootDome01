//package com.example.javascriptbootdome01.RedisCache;
//
//import com.example.javascriptbootdome01.SQL.jpa.Discuss;
//import com.example.javascriptbootdome01.SQL.jpa.DiscussRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
///**
// * @author 李晓鹏
// * @date 2023/9/23 12:08
// * @description:
// */
//@Service
//public class RedisService {
//    @Autowired
//    private DiscussRepository mDiscussRepository;
//
//    @Cacheable(cacheNames = "comment", unless = "#result==null")
//    public Discuss findById(int comment_id) {
//        Optional<Discuss> optional = mDiscussRepository.findById(comment_id);
//        if (optional.isPresent()) {
//            return optional.get();
//        }
//        return null;
//    }
//    @CachePut(cacheNames = "comment",key = "#result.id")
//    public Discuss updateComment(Discuss comment){
//        mDiscussRepository.updateDiscuss(comment.getAuthor(),comment.getAid());
//        return comment;
//    }
//    @CacheEvict(cacheNames = "comment")
//    public void deleteComment(int comment_id) {
//        mDiscussRepository.deleteById(comment_id);
//    }
//}
