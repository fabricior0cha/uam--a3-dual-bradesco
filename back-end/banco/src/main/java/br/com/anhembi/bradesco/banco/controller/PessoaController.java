package br.com.anhembi.bradesco.banco.controller;

import br.com.anhembi.bradesco.banco.model.Pessoa;
import br.com.anhembi.bradesco.banco.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<Void> inserir(@RequestBody Pessoa pessoa) {
        service.inserir(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
