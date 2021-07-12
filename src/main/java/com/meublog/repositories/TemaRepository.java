package com.meublog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meublog.models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
