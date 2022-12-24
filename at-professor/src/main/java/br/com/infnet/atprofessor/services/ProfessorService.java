package br.com.infnet.atprofessor.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.atprofessor.entities.Aluno;
import br.com.infnet.atprofessor.entities.Professor;
import br.com.infnet.atprofessor.feignclients.AlunoFeignClient;



@Service
public class ProfessorService {

	
	@Autowired
	private AlunoFeignClient alunoFeignClient;

	


	public Professor getProfessor(long alunoId, int nota) {
	
		Aluno aluno = alunoFeignClient.findById(alunoId).getBody();
		return new Professor(aluno.getAluno(), aluno.getDisciplina(), aluno.getAtividade(), nota);
				

	}

}
