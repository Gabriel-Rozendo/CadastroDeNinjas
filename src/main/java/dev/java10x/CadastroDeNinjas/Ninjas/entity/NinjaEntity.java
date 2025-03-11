package dev.java10x.CadastroDeNinjas.Ninjas.entity;

import dev.java10x.CadastroDeNinjas.Missoes.entity.MissoesEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private MissoesEntity missoes;


}
