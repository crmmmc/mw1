package com.example.mw.dao;

import com.example.mw.pojo.Movie;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MovieMapper {

    //新增
    @Insert("INSERT INTO movie(movieName,director,screenwriter,country,releaseTime,type,poster,introduction,movieURL) " +
            "VALUES(#{movieName},#{director},#{screenwriter},#{country},#{releaseTime},#{type},#{poster},#{introduction},#{movieURL})")
    void insertMovie(Movie movie);

    //用id查询
    @Select("SELECT * FROM movie WHERE id = #{id}")
    Movie selectMovieById(int id);

    //用movieName模糊查询
    @Select("SELECT * FROM movie WHERE movieName LIKE CONCAT('%',#{movieName},'%')")
    List<Movie> selectMovieByMovieMame(String movieName);

    //用type模糊查询
    @Select("SELECT * FROM movie WHERE type LIKE CONCAT('%',#{type},'%')")
    List<Movie> selectMovieByType(String type);

    //用director模糊查询
    @Select("SELECT * FROM movie WHERE director LIKE CONCAT('%',#{director},'%')")
    List<Movie> selectMovieByDirector(String director);

    //用screenwriter模糊查询
    @Select("SELECT * FROM movie WHERE screenwriter LIKE CONCAT('%',#{screenwriter},'%')")
    List<Movie> selectMovieByScreenwriter(String screenwriter);

    //用country模糊查询
    @Select("SELECT * FROM movie WHERE country LIKE CONCAT('%',#{country},'%')")
    List<Movie> selectMovieByCountry(String country);

    //用introduction模糊查询
    @Select("SELECT * FROM movie WHERE introduction LIKE CONCAT('%',#{introduction},'%')")
    List<Movie> selectMovieByIntroduction(String introduction);

    //用id删除
    @Delete("DELETE FROM movie WHERE id=#{id}")
    void deleteMovieById(int id);

    //用pojo修改
    @Update("UPDATE movie SET movieName=#{movieName},director=#{director},screenwriter=#{screenwriter},country=#{country},releaseTime=#{releaseTime},type=#{type},poster=#{poster},introduction=#{introduction},movieURL=#{movieURL} WHERE id=#{id}")
    void updateMovieByPojo(Movie movie);
}




