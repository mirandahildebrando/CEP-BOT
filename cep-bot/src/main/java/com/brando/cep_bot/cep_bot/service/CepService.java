package com.brando.cep_bot.cep_bot.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.brando.cep_bot.cep_bot.model.CepInfo;
import com.brando.cep_bot.cep_bot.repository.CepRepository;

import java.io.*;

// Serviço para processar CEPs e salvar informações no banco de dados
@Service
public class CepService {
    private final CepRepository repository;
    private final RestTemplate restTemplate = new RestTemplate();

    public CepService(CepRepository repository) {
        this.repository = repository;
    }

    public void processarCeps() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Projetos\\Back\\Real\\cep-bot\\cep-bot/src/main/resources/ceps.txt"))) {
            String cep;
            while ((cep = br.readLine()) != null) {
                String url = "https://viacep.com.br/ws/" + cep + "/json/";
                CepInfo info = restTemplate.getForObject(url, CepInfo.class);
                if (info != null) {
                    info.setCep(cep);
                    repository.save(info);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}