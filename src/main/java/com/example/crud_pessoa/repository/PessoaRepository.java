package com.example.crud_pessoa.repository;

import com.example.crud_pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    boolean existsByCpf(String cpf);
}
