package com.example.backend;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inve")
public class inve {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "sku", nullable = false, length = 150)
    private int sku;

    @Column(name = "Artiuclulo", nullable = false, length = 150)
    private String Artiuclulo;
    
    @Column(name = "Marca", nullable = false, length = 150)
    private String Marca;
    
    @Column(name = "Modelo", nullable = false, length = 150)
    private String Modelo;

    @Column(name = "Departamento", nullable = false, length = 150)
    private int Departamento;

    @Column(name = "Clase", nullable = false, length = 150)
    private int Clase;

    @Column(name = "Familia", nullable = false, length = 150)
    private int Familia;

    @Column(name = "Fecha_Alta", nullable = false, length = 150)
    private String Fecha_Alta;

    @Column(name = "Stock", nullable = false, length = 150)
    private String Stock;

    @Column(name = "Cantidad", nullable = false, length = 150)
    private String Cantidad;

    @Column(name = "Descontinuado", nullable = false, length = 150)
    private int Descontinuado;
    
    @Column(name = "Fecha_Baja", nullable = false, length = 150)
    private String Fecha_Baja;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSku() {
        return this.sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getArtiuclulo() {
        return this.Artiuclulo;
    }

    public void setArtiuclulo(String Artiuclulo) {
        this.Artiuclulo = Artiuclulo;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getDepartamento() {
        return this.Departamento;
    }

    public void setDepartamento(int Departamento) {
        this.Departamento = Departamento;
    }

    public int getClase() {
        return this.Clase;
    }

    public void setClase(int Clase) {
        this.Clase = Clase;
    }

    public int getFamilia() {
        return this.Familia;
    }

    public void setFamilia(int Familia) {
        this.Familia = Familia;
    }

    public String getFecha_Alta() {
        return this.Fecha_Alta;
    }

    public void setFecha_Alta(String Fecha_Alta) {
        this.Fecha_Alta = Fecha_Alta;
    }

    public String getStock() {
        return this.Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getDescontinuado() {
        return this.Descontinuado;
    }

    public void setDescontinuado(int Descontinuado) {
        this.Descontinuado = Descontinuado;
    }

    public String getFecha_Baja() {
        return this.Fecha_Baja;
    }

    public void setFecha_Baja(String Fecha_Baja) {
        this.Fecha_Baja = Fecha_Baja;
    }
}
