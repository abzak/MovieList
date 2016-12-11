/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.managedbeans;

import ch.hearc.ig.odi.moviemanager.Services;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.exception.InvalidParameterException;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Zakaria Chentouf
 */
@Named(value = "personManagedBeans")
@RequestScoped
public class PersonManagedBeans {

    @Inject
    Services services;

    private Person personn;
    
    /**
     * Creates a new instance of PersonManagedBeans
     */
    public PersonManagedBeans() {

    }

    @PostConstruct
    public void setParametersFromGet() {
        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        try {
            int personId = Integer.parseInt(req.getParameter("personid"));
            personn = services.getPersonWithId(new Long(personId));
        } catch (Exception e) {
            personn = null;            
        }
    }

    public String getSr() {
        return "test";
    }

    public Person getPersonn() {
        return personn;
    }

    
    
}
