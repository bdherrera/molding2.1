/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.molding3.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AdminSena
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByCodproveedores", query = "SELECT p FROM Proveedores p WHERE p.codproveedores = :codproveedores"),
    @NamedQuery(name = "Proveedores.findByNombreProveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreProveedor = :nombreProveedor"),
    @NamedQuery(name = "Proveedores.findByDireccionProveedor", query = "SELECT p FROM Proveedores p WHERE p.direccionProveedor = :direccionProveedor"),
    @NamedQuery(name = "Proveedores.findByTelefonoProveedor", query = "SELECT p FROM Proveedores p WHERE p.telefonoProveedor = :telefonoProveedor"),
    @NamedQuery(name = "Proveedores.findByNombreMaterial", query = "SELECT p FROM Proveedores p WHERE p.nombreMaterial = :nombreMaterial"),
    @NamedQuery(name = "Proveedores.findByCodMaterial", query = "SELECT p FROM Proveedores p WHERE p.codMaterial = :codMaterial"),
    @NamedQuery(name = "Proveedores.findByCantidadMaterial", query = "SELECT p FROM Proveedores p WHERE p.cantidadMaterial = :cantidadMaterial"),
    @NamedQuery(name = "Proveedores.findByPreciosMaterial", query = "SELECT p FROM Proveedores p WHERE p.preciosMaterial = :preciosMaterial")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer codproveedores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String nombreProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String direccionProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String telefonoProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String nombreMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String codMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String cantidadMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String preciosMaterial;

    public Proveedores() {
    }

    public Proveedores(Integer codproveedores) {
        this.codproveedores = codproveedores;
    }

    public Proveedores(Integer codproveedores, String nombreProveedor, String direccionProveedor, String telefonoProveedor, String nombreMaterial, String codMaterial, String cantidadMaterial, String preciosMaterial) {
        this.codproveedores = codproveedores;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.nombreMaterial = nombreMaterial;
        this.codMaterial = codMaterial;
        this.cantidadMaterial = cantidadMaterial;
        this.preciosMaterial = preciosMaterial;
    }

    public Integer getCodproveedores() {
        return codproveedores;
    }

    public void setCodproveedores(Integer codproveedores) {
        this.codproveedores = codproveedores;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(String cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public String getPreciosMaterial() {
        return preciosMaterial;
    }

    public void setPreciosMaterial(String preciosMaterial) {
        this.preciosMaterial = preciosMaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproveedores != null ? codproveedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.codproveedores == null && other.codproveedores != null) || (this.codproveedores != null && !this.codproveedores.equals(other.codproveedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.molding3.model.Proveedores[ codproveedores=" + codproveedores + " ]";
    }
    
}
