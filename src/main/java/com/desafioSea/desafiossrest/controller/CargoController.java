package com.desafioSea.desafiossrest.controller;

import com.desafioSea.desafiossrest.models.Cargo;
import com.desafioSea.desafiossrest.models.Trabalhador;
import com.desafioSea.desafiossrest.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
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
}

/*
    // ADICIONA TRABALHADOR
    @PostMapping("/{codigo}")
    public String detalhesCargoPost(@PathVariable("codigo") long codigo, @Valid Trabalhador Trabalhador,
                                    BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/{codigo}";
        // RG DUPLICADO
        if (trabalhadorRepository.findByRg(Trabalhador.getRg()) != null) {
            attributes.addFlashAttribute("mensagem_erro", "RG duplicado");
            return "redirect:/{codigo}";
        }

        //REGISTRO DE TRABALHADOR
        Cargo cargo = cargoRepository.findByCodigo(codigo);
        Trabalhador.setCargo(cargo);
        trabalhadorRepository.save(Trabalhador);
        attributes.addFlashAttribute("mensagem", "Trabalhador adicionado com sucesso!");
        return "redirect:/{codigo}";
    }

    // DELETA TRABALHADOR PELO RG
    @RequestMapping("/deletarTrabalhador")
    public String deletarTrabalhador(String rg) {
        Trabalhador trabalhador = trabalhadorRepository.findByRg(rg);
        Cargo cargo = trabalhador.getCargo();
        String codigo = "" + cargo.getCodigo();

        trabalhadorRepository.delete(trabalhador);

        return "redirect:/" + codigo;

    }*/

