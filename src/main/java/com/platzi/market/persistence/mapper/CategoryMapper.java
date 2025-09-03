package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
<<<<<<< HEAD
            @Mapping(source="idCategoria",target="categoryId"),
            @Mapping(source="descripcion",target="category"),
            @Mapping(source="estado",target="active")
=======
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
<<<<<<< HEAD
}
=======
}
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
