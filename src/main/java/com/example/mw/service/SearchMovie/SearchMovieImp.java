package com.example.mw.service.SearchMovie;

import com.example.mw.dao.MovieMapper;
import com.example.mw.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class SearchMovieImp implements SearchMovie{

    @Autowired
    MovieMapper movieMapper;


    @Override
    public List<Movie> searchMovieByKey(String key) {
        List<Movie> nullList=new ArrayList<>();
        try{
            //创建一个list来储存所有movie
            List<Movie> searchMovieList=new ArrayList<Movie>();
            //搜索
            for(Movie m:movieMapper.selectMovieByMovieMame(key)){
                searchMovieList.add(m);
            }
            for(Movie m:movieMapper.selectMovieByDirector(key)){
                searchMovieList.add(m);
            }
            for(Movie m:movieMapper.selectMovieByScreenwriter(key)){
                searchMovieList.add(m);
            }
            for(Movie m:movieMapper.selectMovieByCountry(key)){
                searchMovieList.add(m);
            }
            for(Movie m:movieMapper.selectMovieByType(key)){
                searchMovieList.add(m);
            }
            for(Movie m:movieMapper.selectMovieByIntroduction(key)){
                searchMovieList.add(m);
            }
            //删除重复元素
            HashSet<Movie> moviesSet = new HashSet<Movie>(searchMovieList);
            List<Movie> newSearchMovieList=new ArrayList<Movie>();
            newSearchMovieList.addAll(moviesSet);

            System.out.println(newSearchMovieList.toString());//test

            return newSearchMovieList;
        }catch (Exception e){
            e.printStackTrace();
            return nullList;
        }
    }
}
