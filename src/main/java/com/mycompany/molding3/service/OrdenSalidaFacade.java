/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.molding3.service;

import com.mycompany.molding3.model.OrdenSalida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Admin
 */
@Stateless
public class OrdenSalidaFacade extends AbstractFacade<OrdenSalida> {

    @PersistenceContext(unitName = "com.mycompany_molding3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenSalidaFacade() {
        super(OrdenSalida.class);
    }
    
}
