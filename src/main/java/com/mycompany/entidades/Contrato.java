/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "CONTRATO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByIdContrato", query = "SELECT c FROM Contrato c WHERE c.idContrato = :idContrato"),
    @NamedQuery(name = "Contrato.findByFechaInicio", query = "SELECT c FROM Contrato c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Contrato.findByFechaFinalizacion", query = "SELECT c FROM Contrato c WHERE c.fechaFinalizacion = :fechaFinalizacion"),
    @NamedQuery(name = "Contrato.findByNombreEmpleado", query = "SELECT c FROM Contrato c WHERE c.nombreEmpleado = :nombreEmpleado"),
    @NamedQuery(name = "Contrato.findByApellidoEmpleado", query = "SELECT c FROM Contrato c WHERE c.apellidoEmpleado = :apellidoEmpleado"),
    @NamedQuery(name = "Contrato.findByDui", query = "SELECT c FROM Contrato c WHERE c.dui = :dui")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="contrato_sec", sequenceName="sec_contrato", allocationSize = 1 )
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contrato_sec")
    
    @Column(name = "ID_CONTRATO")
    private BigDecimal idContrato;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FINALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizacion;
    @Size(max = 20)
    @Column(name = "NOMBRE_EMPLEADO")
    private String nombreEmpleado;
    @Size(max = 20)
    @Column(name = "APELLIDO_EMPLEADO")
    private String apellidoEmpleado;
    @Column(name = "DUI")
    private BigInteger dui;

    public Contrato() {
    }

    public Contrato(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public BigDecimal getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public BigInteger getDui() {
        return dui;
    }

    public void setDui(BigInteger dui) {
        this.dui = dui;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContrato != null ? idContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idContrato == null && other.idContrato != null) || (this.idContrato != null && !this.idContrato.equals(other.idContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entidades.Contrato[ idContrato=" + idContrato + " ]";
    }
    
}
