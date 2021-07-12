package com.exercicio.meublog.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.meublog.Models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
