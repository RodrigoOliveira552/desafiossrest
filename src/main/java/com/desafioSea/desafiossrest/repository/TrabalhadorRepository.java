package com.desafioSea.desafiossrest.repository;

import com.desafioSea.desafiossrest.models.Cargo;
import com.desafioSea.desafiossrest.models.Trabalhador;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrabalhadorRepository extends CrudRepository<Trabalhador, String> {

    Iterable<Trabalhador>findByCargo(Cargo cargo);

    Trabalhador findByRg(String rg);

    Trabalhador findById(long id);

    List<Trabalhador> findByNomeTrabalhador(String nomeTrabalhador);


}