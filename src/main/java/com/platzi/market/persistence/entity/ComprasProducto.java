package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

@Entity
<<<<<<< HEAD
@Table(name = "compras_productos")
public class ComprasProducto {
=======
@Table(name="compras_productos")
public class ComprasProducto {

>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
<<<<<<< HEAD
    private Double total;
    private Boolean estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
=======

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    private Compra compra;

    @ManyToOne
    @JoinColumn(name="id_producto", insertable = false, updatable = false)
    private Producto producto;

<<<<<<< HEAD
=======

>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

<<<<<<< HEAD
    public Double getTota() {
        return total;
    }

    public void setTota(Double tota) {
        this.total = tota;
=======
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
<<<<<<< HEAD

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
=======
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
}
