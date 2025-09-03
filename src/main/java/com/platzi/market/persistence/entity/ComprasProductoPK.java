package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {
<<<<<<< HEAD
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name="id_producto")
=======

    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
