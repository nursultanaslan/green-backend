package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Comment;
import com.nur.ubeyde.green_yesil.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/list")
    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    @PostMapping("/param")
    public String param(@RequestParam Short likeCount,@RequestParam String comment, @RequestParam String date,
                             @RequestParam Integer care_id, @RequestParam Integer user_id){  //RequestParam url'deki parametre değerlerini değişkenlere aktarır.
        Comment yeniYorum = new Comment();
        yeniYorum.setLikeCount(likeCount);
        yeniYorum.setComment(comment);
        yeniYorum.setDate(LocalDate.parse(date));
        yeniYorum.setCare_id(care_id);
        yeniYorum.setUser_id(user_id);

        commentRepository.save(yeniYorum);
        return "Yorumunuz eklendi.";
    }

    @PostMapping("/body")
    public String body(@RequestBody Comment comment){     //RequestBody bir sınıfı parametre olarak almak icin kullanılır.
       commentRepository.save(comment);
        return "Yorumunuz eklendi.";

    }

    @PostMapping("/path/{likeCount}/{comment}/{date}/{care_id}/{user_id}")
    public String path(@PathVariable("likeCount") Short likeCount, @PathVariable("comment") String comment,
                                 @PathVariable("date") String date, @PathVariable("care_id") Integer care_id,
                                 @PathVariable("user_id") Integer user_id){  //PathVariable url'in belli kısmındaki bilgiyi alır.
        Comment yeniYorum = new Comment();
        yeniYorum.setLikeCount(likeCount);
        yeniYorum.setComment(comment);
        yeniYorum.setDate(LocalDate.parse(date));
        yeniYorum.setCare_id(care_id);
        yeniYorum.setUser_id(user_id);

        commentRepository.save(yeniYorum);
        return "yorumunuz eklendi.";

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer comment_id){  //PathVariable burada url'in belli kısmındaki bilgiyi almak için kullanıldı.
        commentRepository.deleteById(comment_id);
        return "yorumunuz silindi";

    }
}
