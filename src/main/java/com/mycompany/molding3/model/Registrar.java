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
 * @author Admin
 */
@Entity
@Table(name = "registrar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registrar.findAll", query = "SELECT r FROM Registrar r"),
    @NamedQuery(name = "Registrar.findByIdRegistrar", query = "SELECT r FROM Registrar r WHERE r.idRegistrar = :idRegistrar"),
    @NamedQuery(name = "Registrar.findByNombre", query = "SELECT r FROM Registrar r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Registrar.findByContrase\u00f1a", query = "SELECT r FROM Registrar r WHERE r.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Registrar.findByGenero", query = "SELECT r FROM Registrar r WHERE r.genero = :genero"),
    @NamedQuery(name = "Registrar.findByRol", query = "SELECT r FROM Registrar r WHERE r.rol = :rol"),
    @NamedQuery(name = "Registrar.findByFechaNacimiento", query = "SELECT r FROM Registrar r WHERE r.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Registrar.findByTelefono", query = "SELECT r FROM Registrar r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Registrar.findByCorreo", query = "SELECT r FROM Registrar r WHERE r.correo = :correo")})
public class Registrar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registrar")
    private Integer idRegistrar;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Size(max = 45)
    @Column(name = "genero")
    private String genero;
    @Size(max = 45)
    @Column(name = "rol")
    private String rol;
    @Size(max = 45)
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;

    public Registrar() {
    }

    public Registrar(Integer idRegistrar) {
        this.idRegistrar = idRegistrar;
    }

    public Integer getIdRegistrar() {
        return idRegistrar;
    }

    public void setIdRegistrar(Integer idRegistrar) {
        this.idRegistrar = idRegistrar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistrar != null ? idRegistrar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registrar)) {
            return false;
        }
        Registrar other = (Registrar) object;
        if ((this.idRegistrar == null && other.idRegistrar != null) || (this.idRegistrar != null && !this.idRegistrar.equals(other.idRegistrar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.molding3.model.Registrar[ idRegistrar=" + idRegistrar + " ]";
    }
    
}
