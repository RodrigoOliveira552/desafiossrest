package com.desafioSea.desafiossrest.controller;

import com.desafioSea.desafiossrest.models.Cargo;
import com.desafioSea.desafiossrest.models.Trabalhador;
import com.desafioSea.desafiossrest.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api") pro swagger
@Api(value = "REST DesafioSea")
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;

    //Lista todos os cargos
    @GetMapping("/cargos")
    public List<Cargo> listaCargos() {
        return cargoRepository.findAll();
    }

    //Lista apenas um cargo por id
    @GetMapping("/cargo")
    public Cargo listaCargoUnico(@PathVariable(value = "id") long id) {
        return cargoRepository.findById(id);
    }

    //Salvar um cargo
    @PostMapping("/cargo")
    public Cargo salvaCargo(@RequestBody Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    //Deletar um cargo
    @DeleteMapping("/cargo")
    public void deletaCargo(@RequestBody Cargo cargo) {
        cargoRepository.delete(cargo);
    }

    //Atualizar um cargo
    @PutMapping("/cargo")
    public Cargo atualizaCargo(@RequestBody Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    // ADICIONA TRABALHADOR

    @PostMapping("/trabalhador")
    public ResponseEntity<Trabalhador> adicionarTrabalhador(@RequestBody Trabalhador trabalhador) {
        return ResponseEntity.status(HttpStatus.CREATED).body(trabalhador);

    //    DELETA TRABALHADOR PELO CPF

    @DeleteMapping("/deletaTrabalhador")
    public ResponseEntity<Trabalhador> deletarTrabalhador(@RequestBody Trabalhador trabalhador) {
        return ResponseEntity.status(HttpStatus.OK).body(trabalhador);
    }

    }
}

