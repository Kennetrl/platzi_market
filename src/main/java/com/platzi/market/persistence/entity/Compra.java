package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
<<<<<<< HEAD
@Table(name = "compras")
public class Compra {
=======
@Table(name="compras")
public class Compra {

>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name="id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

<<<<<<< HEAD
    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
    private List<ComprasProducto> productos;
=======
    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> producto;
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
<<<<<<< HEAD

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ComprasProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<ComprasProducto> productos) {
        this.productos = productos;
    }
=======
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
}
