package com.example.demo.Repository;

import com.example.demo.Enitity.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInterface extends CrudRepository<MovieEntity,Long> {
}
