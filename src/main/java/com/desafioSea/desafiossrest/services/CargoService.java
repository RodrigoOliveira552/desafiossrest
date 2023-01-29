package com.desafioSea.desafiossrest.services;

import com.desafioSea.desafiossrest.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CargoService {

    final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }


}
