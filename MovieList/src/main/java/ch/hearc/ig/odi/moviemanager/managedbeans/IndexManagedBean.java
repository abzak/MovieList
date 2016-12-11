/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.managedbeans;


import ch.hearc.ig.odi.moviemanager.Services;
import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import java.util.List;
import javax.inject.Named; 
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Zakaria Chentouf
 */
@RequestScoped
@Named(value = "indexManagedBean")
public class IndexManagedBean {

    @Inject
    Services services;
    /**
     * Creates a new instance of IndexManagedBean
     */
    public IndexManagedBean() {
    }
    
    
    
    public List<Person> getPersonList() {
        return services.getPeopleList();
    }
    
    public List<Movie> getMovieList() {
        return services.getMoviesList();
    }
    
    public int getMovieNumber(int movieId){
        return services.getNumberOwner(movieId);
    }
    
    
    
      
}
