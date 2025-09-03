package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column(name="id_categoria")
    private Integer idCategoria;

    private String descripcion;

=======
    @Column(name = "id_categoria")
    private Integer idCategoria;
    private String descripcion;
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

<<<<<<< HEAD
=======


    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
<<<<<<< HEAD

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


}
=======
}
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
