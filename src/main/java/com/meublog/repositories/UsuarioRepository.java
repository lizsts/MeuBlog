package com.meublog.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meublog.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	
}

