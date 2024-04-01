package br.com.projeto.pizzaria3f.service;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.pizzaria3f.model.entity.Aluno;
import br.com.projeto.pizzaria3f.model.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {

	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(98546, "osvaldo", 35);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		List<Aluno> alunos = new ArrayList();
		alunos.add(new Aluno(98655, "alfredo", 35));
		alunos.add(new Aluno(92655, "will", 55));
		alunos.add(new Aluno(90655, "ares", 15));

		return alunos;
	}

	@Override
	public Aluno findByRm(long rm) {
		List<Aluno> alunos = new ArrayList();
		alunos.add(new Aluno(98655, "alfredo", 35));
		alunos.add(new Aluno(92655, "will", 55));
		alunos.add(new Aluno(90655, "ares", 15));
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}

		}
		return null;
	}

}
