package com.example.mw.service.AdministratorOperation;

import com.example.mw.dao.MovieMapper;
import com.example.mw.pojo.Actor;
import com.example.mw.pojo.Movie;
import com.example.mw.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class AdministratorOperationImp implements AdministratorOperation{

    @Autowired
    MovieMapper movieMapper;

    //上传
    @Override
    public boolean uploadMovie(Movie movie) {
        try {
            movieMapper.insertMovie(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //更新pojo
    @Override
    public boolean updateMovie(int id, Movie movie) {
        try {
            //把id设为movie的id
            movie.setId(id);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }

    //更新基本类型信息
    @Override
    public boolean editMovieName(int id, String movieName) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setMovieName(movieName);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editDirector(int id, String director) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setDirector(director);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editScreenwriter(int id, String screenwriter) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setScreenwriter(screenwriter);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editCountry(int id, String country) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setCountry(country);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editReleaseTime(int id, Timestamp releaseTime) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setReleaseTime(releaseTime);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editType(int id, String type) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setType(type);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editPoster(int id, String poster) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setPoster(poster);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editIntroduction(int id, String introduction) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setIntroduction(introduction);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editMovieURL(int id, String movieURL) {
        try {
            Movie movie=movieMapper.selectMovieById(id);
            movie.setMovieURL(movieURL);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //更新list类型信息
    @Override
    public boolean addActor(int id, Actor actor) {
        try {
            List<Actor> actorList=movieMapper.selectMovieById(id).getActorList();
            Movie movie=movieMapper.selectMovieById(id);
            actorList.add(actor);
            movie.setActorList(actorList);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addTag(int id, Tag tag) {
        try{
            List<Tag> tagList=movieMapper.selectMovieById(id).getMovieTags();
            Movie movie=movieMapper.selectMovieById(id);
            tagList.add(tag);
            movie.setMovieTags(tagList);
            movieMapper.updateMovieByPojo(movie);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editActor(int id, List<Actor> actorList) {
        try{
            Movie movie=movieMapper.selectMovieById(id);
            movie.setActorList(actorList);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editTag(int id, List<Tag> tagList) {
        try{
            Movie movie=movieMapper.selectMovieById(id);
            movie.setMovieTags(tagList);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //删除movie
    @Override
    public boolean deleteMovie(int id) {
        try{
            movieMapper.deleteMovieById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
