package com.example.mw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    //id
    private int id;

    //电影名
    private String movieName;

    //导演
    private String director;

    //编剧
    private String screenwriter;

    //主演
    private List<Actor> actorList;

    //国家
    private String country;

    //上映日期
    private Timestamp releaseTime;

    //类型
    private String type;

    //海报
    private String poster;

    //简介
    private String introduction;

    //标签
    private List<Tag> movieTags;

    //影片地址
    private String movieURL;
}
