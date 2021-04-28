package com.example.demo.Enitity;

import com.example.demo.Repository.MovieInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class MovieService {

    private final MovieInterface movieInterface;

    public MovieService(MovieInterface movieInterface) {
        this.movieInterface = movieInterface;
    }


    public void addMovie(MovieEntity movie) {

        movieInterface.save(movie);

    }

    public List<MovieEntity> getAllMovies(MovieEntity movie){
        var it = movieInterface.findAll();
        List<MovieEntity> movieList = new ArrayList<>();
        it.forEach(movieList::add);
        return movieList;
    }
}
