package com.example.mw.controller;

import com.example.mw.pojo.Movie;
import com.example.mw.service.SearchMovie.SearchMovieImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SearchMovieController {

    @Autowired
    SearchMovieImp searchMovieImp;

    @RequestMapping("/search/{key}")
    @ResponseBody
    public List<Movie> doSearchMovie(@PathVariable(name="key") String key){
        List<Movie> movieListByKey=searchMovieImp.searchMovieByKey(key);
        return movieListByKey;
    }
}
