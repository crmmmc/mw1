package com.example.mw.controller;

import com.example.mw.pojo.Movie;
import com.example.mw.service.AdministratorOperation.AdministratorOperationImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AdministratorOperationController {

    @Autowired
    AdministratorOperationImp administratorOperationImp;

    @RequestMapping("/admin/upload")
    public String doUploadMovie(@RequestParam(name = "movieName") String movieName , @RequestParam(name = "director") String director ,
                                @RequestParam(name = "screenwriter") String screenwriter , @RequestParam(name = "country") String country ,
                                @RequestParam(name = "type") String type, @RequestParam(name = "poster") String poster,
                                @RequestParam(name = "introduction") String introduction ,@RequestParam(name = "movieURL")  String movieURL){
        try{
            Movie movie=new Movie();
            movie.setMovieName(movieName);
            movie.setDirector(director);
            movie.setCountry(country);
            movie.setIntroduction(introduction);
            movie.setScreenwriter(screenwriter);
            movie.setType(type);
            movie.setPoster(poster);
            movie.setMovieURL(movieURL);
            administratorOperationImp.uploadMovie(movie);

            return "upload success";
        }catch (Exception e){
            return "upload error";
        }
    }

    @RequestMapping("/admin/delete")
    public String doDeleteMovie(@RequestParam(name="id")int id){
        try{
            administratorOperationImp.deleteMovie(id);
            return "delete success";
        }catch (Exception e){
            return "delete error";
        }
    }

    @RequestMapping("/admin/edit/movieName")
    public String doEditMovieNme(@RequestParam(name="id")int id ,@RequestParam(name="movieName")String movieName){
        try{
            administratorOperationImp.editMovieName(id,movieName);
            return "doEditMovieNme success";
        }catch (Exception e){
            return "doEditMovieNme error";
        }
    }

}
