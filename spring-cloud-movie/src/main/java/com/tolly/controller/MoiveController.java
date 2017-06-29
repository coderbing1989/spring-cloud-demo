package com.tolly.controller;

import com.tolly.entity.Movie;
import com.tolly.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/16.
 */
@RestController
public class MoiveController {


    @GetMapping("/movie/{id}")
    public Movie findById(@PathVariable Long id){

        Movie movie = null;
        if(null!=id&&id.equals(1l)){
            movie = new Movie();
            movie.setId(1l);
            movie.setMoney(100);
            movie.setMovieName("摔跤吧！爸爸");
        }

        return movie;
    }

}
