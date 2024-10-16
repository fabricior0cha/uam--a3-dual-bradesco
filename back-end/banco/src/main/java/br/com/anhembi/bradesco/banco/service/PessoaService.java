package br.com.anhembi.bradesco.banco.service;

import br.com.anhembi.bradesco.banco.model.Pessoa;
import br.com.anhembi.bradesco.banco.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    //inversão de dependência
    @Autowired
    private PessoaRepository repository;

    public void inserir(Pessoa pessoa){
        repository.inserir(pessoa.getNome(), pessoa.getCpf());
    }
}
