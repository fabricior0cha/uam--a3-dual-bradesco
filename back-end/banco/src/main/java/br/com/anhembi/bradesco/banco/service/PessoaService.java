package br.com.anhembi.bradesco.banco.service;

import br.com.anhembi.bradesco.banco.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;
}
