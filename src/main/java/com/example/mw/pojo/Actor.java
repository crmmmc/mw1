package com.example.mw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    //id
    private int id;

    //演员名
    private String actorName;

    //作品
    private List<Movie> works;

    //照片
    private String photo;

    //生日
    private Timestamp birthday;
}
