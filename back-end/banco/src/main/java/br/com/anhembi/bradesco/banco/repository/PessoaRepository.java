package br.com.anhembi.bradesco.banco.repository;

import br.com.anhembi.bradesco.banco.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    @Modifying
    @Transactional
    @Query(value = "CALL SP_IN_UP_PESSOAS(:nome, :cpf, NULL);", nativeQuery = true)
    void inserir(@Param("nome") String nome,@Param("cpf") String cpf);
}
