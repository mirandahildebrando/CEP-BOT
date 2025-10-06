package com.brando.cep_bot.cep_bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brando.cep_bot.cep_bot.model.CepInfo;

@Repository
public interface CepRepository extends JpaRepository<CepInfo, Long> {

} 


