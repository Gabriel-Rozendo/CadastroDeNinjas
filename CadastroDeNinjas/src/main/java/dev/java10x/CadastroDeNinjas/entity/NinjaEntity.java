package dev.java10x.CadastroDeNinjas.entity;

import jakarta.persistence.*;

// Entity - Ele transforma uma classe em uma entidade no banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaEntity() {
    }

    public NinjaEntity(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
