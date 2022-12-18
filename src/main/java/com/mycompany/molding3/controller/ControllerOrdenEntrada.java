/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.molding3.controller;


import com.mycompany.molding3.model.OrdenEntrada;
import com.mycompany.molding3.service.OrdenEntradaFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Dell
 */
@Named(value = "controllerOrdenEntrada")
@SessionScoped
public class ControllerOrdenEntrada implements Serializable {

    /**
     * Definicion de variables
     */
    private String message;
    private OrdenEntrada entrada = new OrdenEntrada();
    
    @EJB
    
    private OrdenEntradaFacade entradafacade;
    
   
    //crud orden de Entrada
    public List<OrdenEntrada> getALLOrdenEntrada() {
        return getEntradafacade().findAll();
    }

    public void delete(int id) {
        OrdenEntrada ordenEntrada = new OrdenEntrada();
        ordenEntrada.setIdOrdenEntrada(id);
        entradafacade.remove(entrada);
       
    }

    public void create() {
        entradafacade.create(entrada);
        message("se creo correctamente");
        
    }

    public void update(int id) {
        entrada.setIdOrdenEntrada(id);
        entradafacade.edit(entrada);

        
      
        setMessage("Se actualizo orden entrada correctamente");

    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the entrada
     */
    public OrdenEntrada getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(OrdenEntrada entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the entradafacade
     */
    public OrdenEntradaFacade getEntradafacade() {
        return entradafacade;
    }

    /**
     * @param entradafacade the entradafacade to set
     */
    public void setEntradafacade(OrdenEntradaFacade entradafacade) {
        this.entradafacade = entradafacade;
    }

    private void message(String se_creo_correctamente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

       
    }
