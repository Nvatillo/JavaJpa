package com.fraga.crud.repository;

import com.fraga.crud.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,String> {

     List<Profesor> findByNombre(String nombre);

     Profesor findById(Integer id);


}
