package com.example.crud_pessoa.service;

import com.example.crud_pessoa.model.Endereco;
import com.example.crud_pessoa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco criarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
