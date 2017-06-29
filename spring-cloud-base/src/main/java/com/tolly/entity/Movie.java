package com.tolly.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Movie implements Serializable{

    Long id;

    String movieName;

    Integer money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
