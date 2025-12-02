package com.example.kathub.kathub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kathub.kathub.model.Ventas;

//definimos la clase que va a acceder a la base de datos
@Repository
public interface  VentaRepository extends JpaRepository<Ventas, Long> {
    List<Ventas> findByUsuarioId(Long usuario);
    
}
