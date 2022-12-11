/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.molding3.controller;


import com.mycompany.molding3.model.Proveedores;
import com.mycompany.molding3.service.ProveedoresFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author AdminSena
 */
@Named(value = "controllerProveedores")
@SessionScoped
public class controllerProveedores implements Serializable {

    /**
     * Creates a new instance of controller_Proveedores
     */
    public controllerProveedores() {
        
        
    }
    //creacion de variables
    private Proveedores proveedores = new Proveedores();
    private ProveedoresFacade proveedorfacade;
    private String mensaje;
    
  

    /**
     * @return the proveedores
     */
    public Proveedores getProveedores() {
        return proveedores;
    }

    /**
     * @param proveedores the proveedores to set
     */
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    /**
     * @return the proveedorfacade
     */
    public ProveedoresFacade getProveedorfacade() {
        return proveedorfacade;
    }

    /**
     * @param proveedorfacade the proveedorfacade to set
     */
    public void setProveedorfacade(ProveedoresFacade proveedorfacade) {
        this.proveedorfacade = proveedorfacade;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //metodos CRUD
    
    public List<Proveedores> getAllproveedores(){
        return proveedorfacade.findAll() ;
    }
    
    public void eliminar(int id) {
        Proveedores proveedor = new Proveedores();
        proveedor.setCodproveedores(id);
        proveedorfacade.remove(proveedor);

    }

    public void create() {
        proveedorfacade.create(proveedores);

        mensaje = "Se creo correctamente";

    }

    public void update(int id) {
        proveedores.setCodproveedores(id);
        proveedorfacade.edit(proveedores);
        
        mensaje = " Se acatualizo correctamente";
    }
    
    
    
    
    

}
