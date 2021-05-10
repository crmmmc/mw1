package com.example.mw.service.SearchMovie;

import com.example.mw.pojo.Movie;

import java.util.List;

public interface SearchMovie {

    //字符串搜索
    List<Movie> searchMovieByKey(String key);

}
