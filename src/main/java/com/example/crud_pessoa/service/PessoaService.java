package com.example.crud_pessoa.service;

import com.example.crud_pessoa.model.Pessoa;
import com.example.crud_pessoa.model.Endereco;
import com.example.crud_pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa criarPessoa(Pessoa pessoa) {
        if (pessoaRepository.existsByCpf(pessoa.getCpf())) {
            throw new IllegalArgumentException("CPF já cadastrado.");
        }

        // Atribuir a pessoa a cada endereço
        if (pessoa.getEnderecos() != null) {
            for (Endereco endereco : pessoa.getEnderecos()) {
                endereco.setPessoa(pessoa);
            }
        }

        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarPessoa(Long id, Pessoa pessoaAtualizada) {
        if (!pessoaRepository.existsById(id)) {
            throw new IllegalArgumentException("Pessoa não encontrada");
        }

        // Atribuir a pessoa a cada endereço, caso existam
        if (pessoaAtualizada.getEnderecos() != null) {
            for (Endereco endereco : pessoaAtualizada.getEnderecos()) {
                endereco.setPessoa(pessoaAtualizada);
            }
        }

        pessoaAtualizada.setId(id); // Garantir que o ID da pessoa seja mantido
        return pessoaRepository.save(pessoaAtualizada);
    }

    public void excluirPessoa(Long id){
        if (!pessoaRepository.existsById(id)){
            throw new IllegalArgumentException("Pessoa não encontrada");
        }
        pessoaRepository.deleteById(id);
    }
}
