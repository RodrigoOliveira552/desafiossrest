package com.desafioSea.desafiossrest.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="TB_TRABALHADOR")\
public class Trabalhador {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String cpf;

    @NotEmpty
    private String nomeTrabalhador;

    @NotEmpty
    private String email;

    @OneToOne
    private Cargo cargo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeTrabalhador() {
        return nomeTrabalhador;
    }

    public void setNomeTrabalhador(String nomeTrabalhador) {
        this.nomeTrabalhador = nomeTrabalhador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
