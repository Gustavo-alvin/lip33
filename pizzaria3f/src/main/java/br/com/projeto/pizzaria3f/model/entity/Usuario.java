package br.com.projeto.pizzaria3f.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;
	private String email;
	private String senha;
	private String nivelAcesso;
	private byte foto;
	private LocalDateTime dataCadastro;
	private String statusUsuario;

}
