package com.example.algamoney_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney_api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
