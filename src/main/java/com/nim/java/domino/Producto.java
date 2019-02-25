/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.domino;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Nimrod
 */
@Entity
@Table (name="productos")
public class Producto {
    @Id
    @Column(name="id_producto")
    private int idProducto;
    @Column(name="nombre_producto")
    private String nombreProducto;
    @Column(name="cantidad_producto")
    private double cantidadProducto;
    @Column(name="precio_producto")
    private double precioProducto;
    @Column(name="fecha_crear")
    private Date fechaCrear;
    @Column(name="fecha_actualizar")
    private Date fechaActualizar;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(double cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Date getFechaCrear() {
        return fechaCrear;
    }

    public void setFechaCrear(Date fechaCrear) {
        this.fechaCrear = fechaCrear;
    }

    public Date getFechaActualizar() {
        return fechaActualizar;
    }

    public void setFechaActualizar(Date fechaActualizar) {
        this.fechaActualizar = fechaActualizar;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + ", fechaCrear=" + fechaCrear + ", fechaActualizar=" + fechaActualizar + '}';
    }
    
}
