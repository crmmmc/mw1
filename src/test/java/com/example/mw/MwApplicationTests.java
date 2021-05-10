package com.example.mw;

import com.example.mw.dao.MovieMapper;
import com.example.mw.pojo.Movie;
import com.example.mw.service.SearchMovie.SearchMovie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest
class MwApplicationTests {

    @Autowired
    MovieMapper movieMapper;

    @Autowired
    SearchMovie searchMovie;

    @Test
    void test1() {

        Timestamp timestamp= new Timestamp(System.currentTimeMillis());

        Movie movie = new Movie();
        //movie.setId(1);
        movie.setMovieName("change story");
        movie.setDirector("ak");
        movie.setCountry("China");
        movie.setIntroduction("story of change");
        movie.setScreenwriter("ak");
        movie.setType("action");
        movie.setReleaseTime(timestamp);
        movie.setPoster("D:");

        movieMapper.insertMovie(movie);
    }

    @Test
    void test2(){
        System.out.println(movieMapper.selectMovieById(2).toString());
    }

    @Test
    void test3(){
        System.out.println(movieMapper.selectMovieByMovieMame("ory").toString());
    }

    @Test
    void test4(){
        Timestamp timestamp= new Timestamp(System.currentTimeMillis());

        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("台北故事");
        movie.setDirector("change");
        movie.setCountry("China");
        movie.setIntroduction("story of change");
        movie.setScreenwriter("ak");
        movie.setType("action");
        movie.setReleaseTime(timestamp);
        movie.setPoster("D:");

        movieMapper.updateMovieByPojo(movie);

    }

    @Test
    void test5(){
        movieMapper.deleteMovieById(3);
    }

    @Test
    void test6(){
        searchMovie.searchMovieByKey("change");
    }
}
