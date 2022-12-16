/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.molding3.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "materiales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiales.findAll", query = "SELECT m FROM Materiales m"),
    @NamedQuery(name = "Materiales.findByIdMateriales", query = "SELECT m FROM Materiales m WHERE m.idMateriales = :idMateriales"),
    @NamedQuery(name = "Materiales.findByNombre", query = "SELECT m FROM Materiales m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Materiales.findByCantidad", query = "SELECT m FROM Materiales m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Materiales.findByEstado", query = "SELECT m FROM Materiales m WHERE m.estado = :estado")})
public class Materiales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materiales")
    private Integer idMateriales;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;

    public Materiales() {
    }

    public Materiales(Integer idMateriales) {
        this.idMateriales = idMateriales;
    }

    public Integer getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(Integer idMateriales) {
        this.idMateriales = idMateriales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriales != null ? idMateriales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiales)) {
            return false;
        }
        Materiales other = (Materiales) object;
        if ((this.idMateriales == null && other.idMateriales != null) || (this.idMateriales != null && !this.idMateriales.equals(other.idMateriales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.molding3.model.Materiales[ idMateriales=" + idMateriales + " ]";
    }
    
}
