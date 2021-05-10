package com.example.mw.service.AdministratorOperation;

import com.example.mw.pojo.Actor;
import com.example.mw.pojo.Movie;
import com.example.mw.pojo.Tag;

import java.sql.Timestamp;
import java.util.List;

public interface AdministratorOperation {

    //上传电影
    boolean uploadMovie(Movie movie);

    //更新电影
    boolean updateMovie(int id, Movie movie);

    //修改基本类型电影信息
    boolean editMovieName(int id, String movieName);

    boolean editDirector(int id, String director);

    boolean editScreenwriter(int id, String screenwriter);

    boolean editCountry(int id, String country);

    boolean editReleaseTime(int id, Timestamp releaseTime);

    boolean editType(int id, String type);

    boolean editPoster(int id,String poster);

    boolean editIntroduction(int id ,String introduction);

    boolean editMovieURL(int id, String movieURL);

    //修改list类型电影信息
    boolean addActor(int id, Actor actor);

    boolean addTag(int id, Tag tag);

    boolean editActor(int id, List<Actor> actorList);

    boolean editTag(int id,List<Tag> tagList);

    //删除电影
    boolean deleteMovie(int id);

}
