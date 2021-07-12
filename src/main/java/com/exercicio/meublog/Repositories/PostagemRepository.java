package com.exercicio.meublog.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercicio.meublog.Models.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo); 

	

}
