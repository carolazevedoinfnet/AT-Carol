package br.com.infnet.ataluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infnet.ataluno.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {

}
