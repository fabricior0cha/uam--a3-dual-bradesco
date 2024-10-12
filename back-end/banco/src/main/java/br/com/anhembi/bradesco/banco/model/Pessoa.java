package br.com.anhembi.bradesco.banco.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "TB_PESSOA")
public class Pessoa {
    @Id
    @Column(name = "pessoa_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pessoa_nome")
    private String nome;

    @Column(name = "pessoa_cpf")
    private String cpf;

    @Column(name = "pessoa_dt_nascimento")
    private LocalDate dataNascimento;

    public Pessoa() {
    }
    public Pessoa(Long id, String nome, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
