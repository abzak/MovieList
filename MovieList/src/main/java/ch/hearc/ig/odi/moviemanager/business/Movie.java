/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

/**
 *
 * @author zakariae.chentouf
 */
public class Movie {
    
    private String titre;
    private String auteur;
    private Long id;
    

    public Movie(Long id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
       
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
       boolean ok = false;
        if (obj instanceof Movie) {
            Movie m = (Movie) obj;
            if (m.getId()==this.getId()) {
                ok = true;
            }
        }
        return ok;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
