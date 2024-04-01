package br.com.projeto.pizzaria3f.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projeto.pizzaria3f.model.entity.Usuario;
import br.com.projeto.pizzaria3f.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository UsuarioRepository;

	public List<Usuario> findAll() {
		List<Usuario> usuarios = UsuarioRepository.findAll();
		return usuarios;
	}

	public Usuario findById(long id) {
		Usuario usuario = UsuarioRepository.findById(id).orElseThrow();
		return usuario;
	}
}
