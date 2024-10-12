package br.com.anhembi.bradesco.banco.controller;

import br.com.anhembi.bradesco.banco.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService service;
}
