package com.example.javascriptbootdome01.RedisCache;//package com.example.javascriptbootdome01.RedisCache;
//
//import com.example.javascriptbootdome01.SQL.jpa.Discuss;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author 李晓鹏
// * @date 2023/9/24 16:12
// * @description:
// */
//@RestController
//public class RedisController {
//
//    @Autowired
//    private RedisService redisService;
//
//    @GetMapping("/getRedis/{id}")
//    public Discuss findById(@PathVariable("id") int comment_id){
//        Discuss mDiscuss = redisService.findById(comment_id);
//        return mDiscuss;
//    }
//    @GetMapping("/update/{id}/{author}")
//    public Discuss updateComment(@PathVariable("id") int comment_id,
//                                 @PathVariable("author") String author){
//        Discuss comment = redisService.findById(comment_id);
//        comment.setAuthor(author);
//        Discuss updateComment = redisService.updateComment(comment);
//        return updateComment;
//    }
//    @GetMapping("/delete/{id}")
//    public void deleteComment(@PathVariable("id") int comment_id){
//        redisService.deleteComment(comment_id);
//    }
//}
