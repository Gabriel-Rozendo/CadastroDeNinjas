package dev.java10x.CadastroDeNinjas.Missoes.entity;

import dev.java10x.CadastroDeNinjas.Ninjas.entity.NinjaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    //@OneToMany - uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaEntity> ninja;


}
