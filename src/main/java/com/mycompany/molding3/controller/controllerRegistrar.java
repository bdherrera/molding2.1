/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.molding3.controller;

import com.mycompany.molding3.model.Registrar;
import com.mycompany.molding3.service.RegistrarFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Admin
 */
@Named(value = "controllerRegistrar")
@SessionScoped
public class controllerRegistrar implements Serializable {
    //creacion de variable
     private List<String> rol = new ArrayList();
     private Registrar registrar=new Registrar();

     @EJB
     private RegistrarFacade registrarfacade;
     
     //select

     
    /**
     * Creates a new instance of controllerRegistrar
     */
    public controllerRegistrar() {
        rol.add("almacenista");
        rol.add("asistente Administrativo");
        rol.add("residente de obra");
    }
    
    
    //crear
    
    public void create(){
        getRegistrarfacade().create(getRegistrar());
    }

    /**
     * @return the rol
     */
    public List<String> getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(List<String> rol) {
        this.rol = rol;
    }

    /**
     * @return the registrar
     */
    public Registrar getRegistrar() {
        return registrar;
    }

    /**
     * @param registrar the registrar to set
     */
    public void setRegistrar(Registrar registrar) {
        this.registrar = registrar;
    }

    /**
     * @return the registrarfacade
     */
    public RegistrarFacade getRegistrarfacade() {
        return registrarfacade;
    }

    /**
     * @param registrarfacade the registrarfacade to set
     */
    public void setRegistrarfacade(RegistrarFacade registrarfacade) {
        this.registrarfacade = registrarfacade;
    }
    
}
