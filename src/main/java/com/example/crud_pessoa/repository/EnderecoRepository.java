package com.example.crud_pessoa.repository;

import com.example.crud_pessoa.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
