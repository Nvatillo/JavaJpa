package com.fraga.crud.repository;

import com.fraga.crud.model.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela,String> {

    public List<Escuela> findByNombre(String nombre);
}
