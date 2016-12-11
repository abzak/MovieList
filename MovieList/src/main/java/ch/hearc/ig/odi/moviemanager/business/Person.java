/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zakariae.chentouf
 */
public class Person {

    private Long id;
    private String prenom;
    private String nom;
    private List<Movie> movieList;

    public Person(Long id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        movieList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addMovie(Movie m) {
        movieList.add(m);
    }

    public void removeMovie(Movie m) {
        movieList.remove(m);
    }

}
