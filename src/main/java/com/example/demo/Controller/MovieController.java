package com.example.demo.Controller;

import com.example.demo.Enitity.MovieEntity;
import com.example.demo.Enitity.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    //todo nie powinno byc na /movie
    @PostMapping("movie/addMovie")
    public void saveMovie(@RequestBody MovieEntity movie) {

        movieService.addMovie(movie);

    }

    @GetMapping("/movie/getMovie")
    public List<MovieEntity> hello(MovieEntity movie) {
        List<MovieEntity> movies;
        movies = movieService.getAllMovies(movie);
        return movies;
    }


    @GetMapping("/index")
    public String home() {
        return "index";
    }


}
