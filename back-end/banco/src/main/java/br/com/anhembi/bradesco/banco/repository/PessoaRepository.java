package br.com.anhembi.bradesco.banco.repository;

import br.com.anhembi.bradesco.banco.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
