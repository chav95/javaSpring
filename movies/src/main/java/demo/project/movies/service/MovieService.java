package demo.project.movies.service;

import demo.project.movies.model.Movie;
import demo.project.movies.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepo.findByImdbId(imdbId);
    }
}
