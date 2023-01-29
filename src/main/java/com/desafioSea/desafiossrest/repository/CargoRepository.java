package com.desafioSea.desafiossrest.repository;


import com.desafioSea.desafiossrest.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findById(long id);
    List<Cargo> findByNome(String nome);

}
