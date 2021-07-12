package com.meublog.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meublog.models.UserLogin;
import com.meublog.models.Usuario;
import com.meublog.services.UsuarioService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user) {
		return usuarioService.Logar(user).map(usuarioExistente -> ResponseEntity.ok(usuarioExistente))
				.orElse(ResponseEntity.status(401).build()); 
	}
	@PostMapping("/cadastrar") 
	public ResponseEntity<Optional<Usuario>> Post (@RequestBody Usuario usuario) {
		return ResponseEntity.status(201).body(usuarioService.cadastrarUsuario(usuario)); 
	}
	
}
