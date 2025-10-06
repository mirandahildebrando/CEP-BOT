package com.brando.cep_bot.cep_bot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brando.cep_bot.cep_bot.service.CepService;


// Controlador REST para iniciar o processamento dos CEPs
@RestController
public class CepController {
    private final CepService service;

    public CepController(CepService service) {
        this.service = service;
    }

    @GetMapping("/consultar-ceps")
    public String consultar() {
        service.processarCeps();
        return "Consulta concluída e salva no banco!";
    }
}



