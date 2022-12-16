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
 * @author kevv_
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByIdproveedores", query = "SELECT p FROM Proveedores p WHERE p.idproveedores = :idproveedores"),
    @NamedQuery(name = "Proveedores.findByCantidadMaterial", query = "SELECT p FROM Proveedores p WHERE p.cantidadMaterial = :cantidadMaterial"),
    @NamedQuery(name = "Proveedores.findByCodigoMaterial", query = "SELECT p FROM Proveedores p WHERE p.codigoMaterial = :codigoMaterial"),
    @NamedQuery(name = "Proveedores.findByDireccionProveedor", query = "SELECT p FROM Proveedores p WHERE p.direccionProveedor = :direccionProveedor"),
    @NamedQuery(name = "Proveedores.findByNombreMaterial", query = "SELECT p FROM Proveedores p WHERE p.nombreMaterial = :nombreMaterial"),
    @NamedQuery(name = "Proveedores.findByNombreProveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreProveedor = :nombreProveedor"),
    @NamedQuery(name = "Proveedores.findByPrecioMaterial", query = "SELECT p FROM Proveedores p WHERE p.precioMaterial = :precioMaterial"),
    @NamedQuery(name = "Proveedores.findByTelefonoProveedor", query = "SELECT p FROM Proveedores p WHERE p.telefonoProveedor = :telefonoProveedor")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Idproveedores")
    private Integer idproveedores;
    @Size(max = 255)
    @Column(name = "cantidad_material")
    private String cantidadMaterial;
    @Size(max = 255)
    @Column(name = "codigo_material")
    private String codigoMaterial;
    @Size(max = 255)
    @Column(name = "direccion_proveedor")
    private String direccionProveedor;
    @Size(max = 255)
    @Column(name = "nombre_material")
    private String nombreMaterial;
    @Size(max = 255)
    @Column(name = "nombre_proveedor")
    private String nombreProveedor;
    @Size(max = 255)
    @Column(name = "precio_material")
    private String precioMaterial;
    @Size(max = 255)
    @Column(name = "telefono_proveedor")
    private String telefonoProveedor;

    public Proveedores() {
    }

    public Proveedores(Integer idproveedores) {
        this.idproveedores = idproveedores;
    }

    public Integer getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(Integer idproveedores) {
        this.idproveedores = idproveedores;
    }

    public String getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(String cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(String precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedores != null ? idproveedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idproveedores == null && other.idproveedores != null) || (this.idproveedores != null && !this.idproveedores.equals(other.idproveedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.molding3.model.Proveedores[ idproveedores=" + idproveedores + " ]";
    }
    
}
