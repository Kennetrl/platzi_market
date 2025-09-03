package com.platzi.market.persistence.crud;

<<<<<<< HEAD
import com.platzi.market.persistence.entity.Categoria;
import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Qualifier;
=======
import com.platzi.market.persistence.entity.Producto;
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    //Podemos usar los Querys nativos
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

=======
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //@Query(value = "SELECT * FROM productos Where id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc (int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
}
