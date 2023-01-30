package com.desafioSea.desafiossrest.repository;

import com.desafioSea.desafiossrest.models.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, String> {

    Iterable<Trabalhador>findByCargo(Trabalhador trabalhador);

    Trabalhador findByCpf(String cpf);

    Trabalhador findById(long id);

    List<Trabalhador>findByNomeTrabalhador(String nomeTrabalhador);

}