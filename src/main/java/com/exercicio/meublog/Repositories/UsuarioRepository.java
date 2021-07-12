package com.exercicio.meublog.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.meublog.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	
}

