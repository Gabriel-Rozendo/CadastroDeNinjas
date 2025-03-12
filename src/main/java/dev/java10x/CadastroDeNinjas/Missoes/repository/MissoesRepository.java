package dev.java10x.CadastroDeNinjas.Missoes.repository;

import dev.java10x.CadastroDeNinjas.Missoes.entity.MissoesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesEntity, Long> {
}
